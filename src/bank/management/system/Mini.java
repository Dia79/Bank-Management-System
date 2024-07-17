package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Collections;

public class Mini extends JFrame implements ActionListener {
    JButton button;
    String pin;
    Mini(String pin){
        this.pin = pin;

        getContentPane().setBackground(new Color(204, 236, 146));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setVerticalAlignment(SwingConstants.TOP);
        label1.setBounds(20,140,340,400);
        add(label1);

        JLabel label2 = new JLabel("Global Trust Bank");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(120,20,200,30);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,30);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,30);
        add(label4);

        try{
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()) {
                label3.setText("Card Number: "+ resultSet.getString("card_no").substring(0,4)+ "XXXXXXXX" + resultSet.getString("card_no").substring(12));

            }
        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            int balance = 0;
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            ArrayList<String> transactions = new ArrayList<>();

            while(resultSet.next()){

                String transaction = resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount") + "<br><br>";
                transactions.add(transaction);

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

            Collections.reverse(transactions); // Reverse the list to get the latest transactions first

            StringBuilder latestTransactions = new StringBuilder("<html>");
            for (int i = 0; i < Math.min(7, transactions.size()); i++) {
                latestTransactions.append(transactions.get(i));
            }
            latestTransactions.append("</html>");

            label1.setText(latestTransactions.toString());
            label4.setText("Your Total Balance is Rs. "+ balance);
        }catch (Exception e){
            e.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }

    public static void main(String[] args) {

        new Mini("");
    }
}
