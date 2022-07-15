package seguroscaiserljr;

/********************************************************************************
 ** Form generated from reading ui file 'frmCaiser.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class FrmCaiser implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionAlta_Cliente;
    public QWidget centralwidget;
    public QPushButton pushAlta;
    public QLabel labelImagen;
    public QMenuBar menubar;
    public QMenu menuMen;
    public QStatusBar statusbar;

    public FrmCaiser() { super(); }

    @Override
    public void setupUi(QMainWindow mainWindow)
    {
        mainWindow.setObjectName("MainWindow");
        mainWindow.resize(new QSize(657, 456).expandedTo(mainWindow.minimumSizeHint()));
        actionAlta_Cliente = new QAction(mainWindow);
        actionAlta_Cliente.setObjectName("actionAlta_Cliente");
        actionAlta_Cliente.triggered.connect(this, "abrirAlta()"); //Abre el diálogo de altas desde el menú
        centralwidget = new QWidget(mainWindow);
        centralwidget.setObjectName("centralwidget");
        pushAlta = new QPushButton(centralwidget);
        pushAlta.setObjectName("pushAlta");
        pushAlta.setGeometry(new QRect(510, 180, 112, 34));
        pushAlta.clicked.connect(this, "abrirAlta()"); //Abre el diálogo de altas al pulsar el botón
        labelImagen = new QLabel(centralwidget);
        labelImagen.setObjectName("labelImagen");
        labelImagen.setGeometry(new QRect(40, 40, 471, 341));
        labelImagen.setPixmap(new QPixmap(("seguros-de-vida.bmp")));
        mainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(mainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 657, 31));
        menuMen = new QMenu(menubar);
        menuMen.setObjectName("menuMen");
        mainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(mainWindow);
        statusbar.setObjectName("statusbar");
        mainWindow.setStatusBar(statusbar);

        menubar.addAction(menuMen.menuAction());
        menuMen.addAction(actionAlta_Cliente);
        retranslateUi(mainWindow);

        mainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow mainWindow)
    {
        mainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Seguros Caiser LJR", null));
        actionAlta_Cliente.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Nueva alta", null));
        pushAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Nueva alta", null));
        labelImagen.setText("");
        menuMen.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Men\u00fa", null));
    } // retranslateUi
    
    /**Método que abre el diálogo de altas
     * 
     */
    void abrirAlta(){
        FrmAlta alta = new FrmAlta();
        QDialog dialog = new QDialog();
        alta.setupUi(dialog);
        dialog.show();
    }

}

