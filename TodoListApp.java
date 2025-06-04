import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoListApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("할 일 리스트");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(new BorderLayout());

        ArrayList<String> todoList = new ArrayList<>();

        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("할 일을 입력하세요:");
        JTextField inputField = new JTextField();
        JButton addButton = new JButton("추가");
        JButton deleteButton = new JButton("삭제");

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
        timeLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));

        Timer timer = new Timer(1000, e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTime = sdf.format(new Date());
            timeLabel.setText("현재 시각: " + currentTime);
        });
        timer.start();

        addButton.addActionListener(e -> {
            String text = inputField.getText().trim();
            if (text.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "할 일을 입력해주세요", "경고", JOptionPane.WARNING_MESSAGE);
                return;
            }

            todoList.add(text);
            updateTodoArea(todoArea, todoList);
            inputField.setText("");
        });

        deleteButton.addActionListener(e -> {
            if (todoList.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "삭제할 항목이 없습니다", "경고", JOptionPane.WARNING_MESSAGE);
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
