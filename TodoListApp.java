import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoListApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(new BorderLayout());

        ArrayList<String> todoList = new ArrayList<>();

        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("Enter your task:");
        JTextField inputField = new JTextField();
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);

        inputPanel.add(label, BorderLayout.WEST);
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(buttonPanel, BorderLayout.EAST);

        topPanel.add(inputPanel, BorderLayout.CENTER);

        JTextArea todoArea = new JTextArea();
        todoArea.setEditable(false);

        JLabel timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));

        Timer timer = new Timer(1000, e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTime = sdf.format(new Date());
            timeLabel.setText("current time: " + currentTime);
        });
        timer.start();

        addButton.addActionListener(e -> {
            String text = inputField.getText().trim();
            if (text.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter your task", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }

            todoList.add(text);
            updateTodoArea(todoArea, todoList);
            inputField.setText("");
        });

        deleteButton.addActionListener(e -> {
            if (todoList.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "There is nothing to delete", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }

            todoList.remove(todoList.size() - 1);
            updateTodoArea(todoArea, todoList);
        });

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(todoArea, BorderLayout.CENTER);
        frame.add(timeLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private static void updateTodoArea(JTextArea area, ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String item : list) {
            sb.append("- ").append(item).append("\n");
        }
        area.setText(sb.toString());
    }
}
