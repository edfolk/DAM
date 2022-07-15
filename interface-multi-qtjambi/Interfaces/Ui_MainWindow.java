/********************************************************************************
 ** Form generated from reading ui file 'frmCaiser.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_MainWindow implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionAlta_Cliente;
    public QWidget centralwidget;
    public QPushButton pushAlta;
    public QLabel labelImagen;
    public QMenuBar menubar;
    public QMenu menuMen;
    public QStatusBar statusbar;

    public Ui_MainWindow() { super(); }

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(657, 456).expandedTo(MainWindow.minimumSizeHint()));
        actionAlta_Cliente = new QAction(MainWindow);
        actionAlta_Cliente.setObjectName("actionAlta_Cliente");
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        pushAlta = new QPushButton(centralwidget);
        pushAlta.setObjectName("pushAlta");
        pushAlta.setGeometry(new QRect(510, 180, 112, 34));
        labelImagen = new QLabel(centralwidget);
        labelImagen.setObjectName("labelImagen");
        labelImagen.setGeometry(new QRect(40, 40, 471, 341));
        labelImagen.setPixmap(new QPixmap(("seguros-de-vida.bmp")));
        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 657, 31));
        menuMen = new QMenu(menubar);
        menuMen.setObjectName("menuMen");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuMen.menuAction());
        menuMen.addAction(actionAlta_Cliente);
        retranslateUi(MainWindow);

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Seguros Caiser LJR", null));
        actionAlta_Cliente.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Nueva alta", null));
        pushAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Nueva alta", null));
        labelImagen.setText("");
        menuMen.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Men\u00fa", null));
    } // retranslateUi

}

