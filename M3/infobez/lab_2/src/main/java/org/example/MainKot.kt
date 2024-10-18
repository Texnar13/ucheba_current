package org.example

import java.awt.Component
import java.awt.Dimension
import javax.swing.*
import javax.swing.text.AttributeSet
import javax.swing.text.PlainDocument


fun main() {
    println("Запуск!")

    createChangePasswordForm()

}

// форма входа
fun createAuthorisationFrame() {

    // создание окна
    val authorisationFrame = JFrame("Вход")
    authorisationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE)
    authorisationFrame.setSize(300, 200)
    authorisationFrame.setLocationRelativeTo(null)

    val panel = JPanel()
    panel.setLayout(BoxLayout(panel, BoxLayout.Y_AXIS))
    authorisationFrame.add(panel)

    // Имя пользователя
    panel.add(JLabel("Имя пользователя").apply {
        setAlignmentX(Component.CENTER_ALIGNMENT)
    })
    val userNameInput = JTextField().apply {
        maximumSize = Dimension(200, 20)
        document = JTextFiledLimit(20, true)
        setAlignmentX(Component.CENTER_ALIGNMENT)
    }
    panel.add(userNameInput)

    // Пароль
    panel.add(JLabel("Пароль").apply {
        setAlignmentX(Component.CENTER_ALIGNMENT)
    })
    val passInput = panel.add(JPasswordField().apply {
        maximumSize = Dimension(200, 20)
        document = JTextFiledLimit(7, false)
        setAlignmentX(Component.CENTER_ALIGNMENT)
    })

    // Статус
    val statusText = panel.add(JLabel("Status").apply {
        setAlignmentX(Component.CENTER_ALIGNMENT)
    })

    // кнопка войти
    val enterButton = JButton("Войти")
    enterButton.setAlignmentX(Component.CENTER_ALIGNMENT)
    panel.add(enterButton)
    enterButton.addActionListener {
        // statusText.text = "hello"
    }

    // кнопка регистрация
    val registerButton = JButton("Регистрация")
    registerButton.setAlignmentX(Component.CENTER_ALIGNMENT)
    panel.add(registerButton)
    registerButton.addActionListener {
        // statusText.text = "hello"
        createRegisterFrame()
    }


    // переотрисовка
    authorisationFrame.isVisible = true
}

// форма регистрация пользователя
fun createRegisterFrame() {

    // создание окна
    val registerFrame = JFrame("Регистрация")
    registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE)
    registerFrame.setSize(400, 400)
    registerFrame.setLocationRelativeTo(null)


    // Имя пользователя
    registerFrame.add(JLabel("Имя пользователя").apply {
        setBounds(50, 0, 150, 20)
    })
    val userLoginInput = registerFrame.add(JTextField().apply {
        document = JTextFiledLimit(20, true)
        setBounds(170, 0, 150, 20)
    }) as JTextField

    // Пароль
    registerFrame.add(JLabel("Пароль").apply {
        setBounds(50, 25, 100, 20)
    })
    val userPasswordInput = registerFrame.add(JPasswordField().apply {
        document = JTextFiledLimit(7, false)
        setBounds(170, 25, 150, 20)
    }) as JPasswordField

    // Фамилия
    registerFrame.add(JLabel("Фамилия").apply {
        setBounds(50, 75, 100, 20)
    })
    val userSecondNameInput = registerFrame.add(JTextField().apply {
        document = JTextFiledLimit(20, true)
        setBounds(170, 75, 150, 20)
    }) as JTextField
    // Имя
    registerFrame.add(JLabel("Имя").apply {
        setBounds(50, 100, 100, 20)
    })
    val userNameInput = registerFrame.add(JTextField().apply {
        document = JTextFiledLimit(20, true)
        setBounds(170, 100, 150, 20)
    }) as JTextField
    // Отчество
    registerFrame.add(JLabel("Отчество").apply {
        setBounds(50, 125, 100, 20)
    })
    val userThirdNameInput = registerFrame.add(JTextField().apply {
        document = JTextFiledLimit(20, true)
        setBounds(170, 125, 150, 20)
    }) as JTextField

    // Дата рождения
    registerFrame.add(JLabel("Дата рождения").apply {
        setBounds(50, 175, 100, 20)
    })
    val userBirthdayInput = registerFrame.add(JTextField().apply {
        document = JTextFiledLimit(20, true)
        setBounds(170, 175, 150, 20)
    }) as JTextField
    // Место рождения
    registerFrame.add(JLabel("Место рождения").apply {
        setBounds(50, 200, 100, 20)
    })
    val userBirthPlaceInput = registerFrame.add(JTextField().apply {
        document = JTextFiledLimit(20, true)
        setBounds(170, 200, 150, 20)
    }) as JTextField
    // Телефон
    registerFrame.add(JLabel("Телефон").apply {
        setBounds(50, 225, 100, 20)
    })
    val userPhoneInput = registerFrame.add(JTextField().apply {
        document = JTextFiledLimit(20, true)
        setBounds(170, 225, 150, 20)
    }) as JTextField



    // кнопка регистрация
    registerFrame.add(JButton("Сохранить").apply {
        setBounds(50, 275, 270, 20)
        addActionListener {
            //lable.text = userNameInput.getText()
        }
    })

    registerFrame.layout = null
    // переотрисовка
    registerFrame.isVisible = true
}

// форма сменя пароля
fun createChangePasswordForm(){

    // создание окна
    val registerFrame = JFrame("Смена пароля")
    registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE)
    registerFrame.setSize(400, 400)
    registerFrame.setLocationRelativeTo(null)


    // Старый пароль
    registerFrame.add(JLabel("Старый пароль").apply {
        setBounds(50, 25, 100, 20)
    })
    val userOldPasswordInput = registerFrame.add(JPasswordField().apply {
        document = JTextFiledLimit(7, false)
        setBounds(170, 25, 150, 20)
    }) as JPasswordField

    // Новый пароль
    registerFrame.add(JLabel("Новый пароль").apply {
        setBounds(50, 50, 100, 20)
    })
    val userNewPasswordInput = registerFrame.add(JPasswordField().apply {
        document = JTextFiledLimit(7, false)
        setBounds(170, 50, 150, 20)
    }) as JPasswordField


    // Статус
    val statusOutput = registerFrame.add(JLabel("").apply {
        setBounds(50, 75, 100, 20)
    }) as JLabel


    // кнопка смены
    registerFrame.add(JButton("Сменить пароль").apply {
        setBounds(50, 275, 270, 20)
        addActionListener {
            statusOutput.text = (userOldPasswordInput.getPassword().toString() == userNewPasswordInput.getPassword().toString()).toString()
        }
    })

    registerFrame.layout = null
    // переотрисовка
    registerFrame.isVisible = true
}

class MainKot {

}

class JTextFiledLimit(
    private val limit: Int,
    private val isLetters: Boolean
) : PlainDocument() {

    override fun insertString(offs: Int, str: String?, a: AttributeSet?) {
        if (str == null)
            return


        // проверка на символы
        val newInput: StringBuilder
        if (!isLetters) {
            newInput = StringBuilder()
            str.forEach {
                if (it.code in 48..58) newInput.append(it)
            }
        } else {
            newInput = StringBuilder(str)
        }


        // если не достигли максимальной длины строки
        if (length + newInput.length <= limit)
            super.insertString(offs, newInput.toString(), a)
    }
}