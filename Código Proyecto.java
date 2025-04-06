package uni.aed.proyecto_soo_gui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Proyecto extends javax.swing.JFrame {
    
    public Proyecto() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Pregunta = new javax.swing.JLabel();
        Resultado_procesos = new javax.swing.JTextField();
        Boton1 = new javax.swing.JButton();
        Resultado = new javax.swing.JLabel();
        Tiempo = new javax.swing.JLabel();
        Boton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Muestra = new javax.swing.JTextArea();
        Tiempo1 = new javax.swing.JLabel();
        Boton3 = new javax.swing.JButton();
        Datos = new javax.swing.JTextField();
        MenuAlgoritmos = new javax.swing.JComboBox<>();
        Tiempo2 = new javax.swing.JLabel();
        Boton4 = new javax.swing.JButton();
        Recopila_quantum = new javax.swing.JTextField();
        Recopila_llegada = new javax.swing.JTextField();
        Recopila_cpu = new javax.swing.JTextField();
        Recopila_prioridades = new javax.swing.JTextField();
        Tiempo3 = new javax.swing.JLabel();
        Boton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pregunta.setText("Digite el numero de procesos:");

        Boton1.setText("Aceptar");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Tiempo.setText("Digite el tiempo de llegada:");

        Boton2.setText("Agregar");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Muestra.setColumns(20);
        Muestra.setRows(5);
        jScrollPane2.setViewportView(Muestra);

        Tiempo1.setText("Digite el tiempo en CPU:");

        Boton3.setText("Agregar");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        MenuAlgoritmos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIFO","SJF","Prioridades","RR","SRTF" }));
        MenuAlgoritmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAlgoritmosActionPerformed(evt);
            }
        });

        Tiempo2.setText("Digite la prioridad del proceso:");

        Boton4.setText("Agregar");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Recopila_quantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recopila_quantumActionPerformed(evt);
            }
        });

        Recopila_llegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recopila_llegadaActionPerformed(evt);
            }
        });

        Recopila_cpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recopila_cpuActionPerformed(evt);
            }
        });

        Recopila_prioridades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recopila_prioridadesActionPerformed(evt);
            }
        });

        Tiempo3.setText("Digite el quantum:");

        Boton5.setText("Agregar");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(MenuAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Datos)
                    .addComponent(Resultado_procesos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pregunta))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Recopila_llegada)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tiempo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(78, 78, 78))
                            .addComponent(Tiempo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Recopila_cpu)
                            .addComponent(Boton3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tiempo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Recopila_quantum)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Boton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Boton5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Recopila_prioridades)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pregunta)
                .addGap(18, 18, 18)
                .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Resultado_procesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Tiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Recopila_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tiempo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Recopila_cpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tiempo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Recopila_prioridades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton4)
                .addGap(7, 7, 7)
                .addComponent(Tiempo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Recopila_quantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MenuAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resultado))
        );

        pack();
    }// </editor-fold>                        

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        Resultado_procesos.setText("Número de procesos: " + Datos.getText());
        num_procesos = Integer.parseInt(Datos.getText());
    }                                      

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
       if(tiemposLlegada.size()< num_procesos){
        tiemposLlegada.add(Integer.parseInt(Recopila_llegada.getText()));
        Muestra.append("Tiempo de llegada del proceso " + (tiemposLlegada.size()) + ": " + Recopila_llegada.getText() + "\n");
        Recopila_llegada.setText("");
        }else{
            Muestra.append("No hay más procesos\n");
        }
    }                                      

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if(tiemposCPU.size() < num_procesos){
            tiemposCPU.add(Integer.parseInt(Recopila_cpu.getText()));
            Muestra.append("Tiempo en CPU del proceso " + (tiemposCPU.size()) + ": " + Recopila_cpu.getText() + "\n");
            Recopila_cpu.setText("");
        } else {
            Muestra.append("No hay más procesos\n");
        }
    }                                      

    private void MenuAlgoritmosActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        if(tiemposLlegada.size() == num_procesos && tiemposCPU.size() == num_procesos){
        String elegirAlgoritmo = (String) MenuAlgoritmos.getSelectedItem();
        switch (elegirAlgoritmo) {
            case "FIFO":
                ejecutarFifo();
                break;
            case "SJF":
                ejecutarSJF();
                break;
            case "Prioridades":
                ejecutarPrioridades();
                break;
            case "RR":
                ejecutarRR();
                break;
            case "SRTF":
                ejecutarSRTF();
                break;
            default:
                Muestra.append("Algoritmo no implementado\n");
                break;
        }
      }   
    }                                              

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if(prioridades.size() < num_procesos){
            prioridades.add(Integer.parseInt(Recopila_prioridades.getText()));
            Muestra.append("Prioridad del proceso " + (prioridades.size()) + ": " + Recopila_prioridades.getText() + "\n");
            Recopila_prioridades.setText("");
        } else {
            Muestra.append("No hay más procesos\n");
        }
    }                                      

    private void Recopila_quantumActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void Recopila_cpuActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void Recopila_llegadaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void Recopila_prioridadesActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if(contador_quantum==0){
            Muestra.append("Quantum : "+Recopila_quantum.getText() + "\n");
            contador_quantum++;
        }else{
            Muestra.append("Solo digite un valor de quantum\n");
        }
    }                                      
    //Metodo para el algoritmo FIFO
    private void ejecutarFifo(){
        int[][] procesos = new int[num_procesos][2];
        for (int i = 0; i < num_procesos; i++) {
            procesos[i][0] = tiemposLlegada.get(i);
            procesos[i][1] = tiemposCPU.get(i);
        }

        Arrays.sort(procesos, Comparator.comparingInt(a -> a[0]));

        int tiempoActual = 0;
        int[] tiemposEspera = new int[num_procesos];
        double[] tiemposRespuesta = new double[num_procesos];
        double[] tiemposPenalizacion = new double[num_procesos];

        for (int i = 0; i < num_procesos; i++) {
            tiemposEspera[i] = tiempoActual - procesos[i][0];
            tiemposRespuesta[i] = tiemposEspera[i] + procesos[i][1];
            tiemposPenalizacion[i] = tiemposRespuesta[i] / procesos[i][1];

            if (tiempoActual < procesos[i][0]) {
                tiempoActual = procesos[i][0];
            }
            tiempoActual += procesos[i][1];
        }

        Muestra.append("----- Resultados Algoritmo FIFO -----\n");
        for (int i = 0; i < num_procesos; i++) {
            Muestra.append("Proceso " + (i + 1) + " tiempo de espera: " + tiemposEspera[i] + "\n");
            Muestra.append("Proceso " + (i + 1) + " tiempo de respuesta: " + tiemposRespuesta[i] + "\n");
            Muestra.append("Proceso " + (i + 1) + " tiempo de penalización: " + tiemposPenalizacion[i] + "\n");
        }
        Muestra.append("Tiempo total de ejecución: " + tiempoActual + "\n");
    }
    //Metodo para el algoritmo SJF
    private void ejecutarSJF(){
        int[][] procesos = new int[num_procesos][2];
        for (int i = 0; i < num_procesos; i++) {
            procesos[i][0] = tiemposLlegada.get(i);
            procesos[i][1] = tiemposCPU.get(i);
        }

        Arrays.sort(procesos, Comparator.comparingInt(a -> a[0]));

        int tiempoActual = 0;
        int[] tiemposEspera = new int[num_procesos];
        double[] tiemposRespuesta = new double[num_procesos];
        double[] tiemposPenalizacion = new double[num_procesos];

        boolean[] procesoCompletado = new boolean[num_procesos];
        int procesosCompletados = 0;

        while (procesosCompletados < num_procesos) {
            int procesoSeleccionado = -1;
            int tiempoMinimo = Integer.MAX_VALUE;

            for (int i = 0; i < num_procesos; i++) {
                if (!procesoCompletado[i] && procesos[i][0] <= tiempoActual && procesos[i][1] < tiempoMinimo) {
                    tiempoMinimo = procesos[i][1];
                    procesoSeleccionado = i;
                }
            }

            if (procesoSeleccionado == -1) {
                tiempoActual++;
                continue;
            }

            tiempoActual += procesos[procesoSeleccionado][1];
            tiemposEspera[procesoSeleccionado] = tiempoActual - procesos[procesoSeleccionado][0] - procesos[procesoSeleccionado][1];
            tiemposRespuesta[procesoSeleccionado] = tiempoActual - procesos[procesoSeleccionado][0];
            tiemposPenalizacion[procesoSeleccionado] = tiemposRespuesta[procesoSeleccionado] / (double) procesos[procesoSeleccionado][1];

            procesoCompletado[procesoSeleccionado] = true;
            procesosCompletados++;
        }

        Muestra.append("----- Resultados Algoritmo SJF -----\n");
        for (int i = 0; i < num_procesos; i++) {
            Muestra.append("Proceso " + (i + 1) + " tiempo de espera: " + tiemposEspera[i] + "\n");
            Muestra.append("Proceso " + (i + 1) + " tiempo de respuesta: " + tiemposRespuesta[i] + "\n");
            Muestra.append("Proceso " + (i + 1) + " tiempo de penalización: " + tiemposPenalizacion[i] + "\n");
        }
        Muestra.append("Tiempo total de ejecución: " + tiempoActual + "\n");
    }
    //Metodo para el algoritmo por Prioridades
    private void ejecutarPrioridades(){
        int[][] procesos = new int[num_procesos][3];
        for (int i = 0; i < num_procesos; i++) {
            procesos[i][0] = tiemposLlegada.get(i);
            procesos[i][1] = tiemposCPU.get(i);
            procesos[i][2] = prioridades.get(i);
        }

        Arrays.sort(procesos, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]); // Ordenar por tiempo de llegada
            return Integer.compare(a[2], b[2]); // Si el tiempo de llegada es el mismo, ordenar por prioridad
        });

        int tiempoActual = 0;
        int[] tiemposEspera = new int[num_procesos];
        double[] tiemposRespuesta = new double[num_procesos];
        double[] tiemposPenalizacion = new double[num_procesos];

        boolean[] procesoCompletado = new boolean[num_procesos];
        int procesosCompletados = 0;

        while (procesosCompletados < num_procesos) {
            int procesoSeleccionado = -1;
            int prioridadMaxima = Integer.MAX_VALUE;

            for (int i = 0; i < num_procesos; i++) {
                if (!procesoCompletado[i] && procesos[i][0] <= tiempoActual && procesos[i][2] < prioridadMaxima) {
                    prioridadMaxima = procesos[i][2];
                    procesoSeleccionado = i;
                }
            }

            if (procesoSeleccionado == -1) {
                tiempoActual++;
                continue;
            }

            tiempoActual += procesos[procesoSeleccionado][1];
            tiemposEspera[procesoSeleccionado] = tiempoActual - procesos[procesoSeleccionado][0] - procesos[procesoSeleccionado][1];
            tiemposRespuesta[procesoSeleccionado] = tiempoActual - procesos[procesoSeleccionado][0];
            tiemposPenalizacion[procesoSeleccionado] = tiemposRespuesta[procesoSeleccionado] / (double) procesos[procesoSeleccionado][1];

            procesoCompletado[procesoSeleccionado] = true;
            procesosCompletados++;
        }

        Muestra.append("----- Resultados Algoritmo por Prioridades -----\n");
        for (int i = 0; i < num_procesos; i++) {
            Muestra.append("Proceso " + (i + 1) + " tiempo de espera: " + tiemposEspera[i] + "\n");
            Muestra.append("Proceso " + (i + 1) + " tiempo de respuesta: " + tiemposRespuesta[i] + "\n");
            Muestra.append("Proceso " + (i + 1) + " tiempo de penalización: " + tiemposPenalizacion[i] + "\n");
        }
        Muestra.append("Tiempo total de ejecución: " + tiempoActual + "\n");
    }
    
    //Metodo para el algoritmo RR
    private void ejecutarRR(){
    int quantum = Integer.parseInt(Recopila_quantum.getText());
    int[][] procesos = new int[num_procesos][3];
    for (int i = 0; i < num_procesos; i++) {
        procesos[i][0] = tiemposLlegada.get(i);
        procesos[i][1] = tiemposCPU.get(i);
        procesos[i][2] = tiemposCPU.get(i); // Tiempo restante
    }

    int tiempoActual = 0;
    int[] tiemposEspera = new int[num_procesos];
    double[] tiemposRespuesta = new double[num_procesos];
    double[] tiemposPenalizacion = new double[num_procesos];
    int procesosCompletados = 0;

    ArrayList<Integer> cola = new ArrayList<>();
    for (int i = 0; i < num_procesos; i++) {
        cola.add(i);
    }

    while (!cola.isEmpty()) {
        int i = cola.remove(0);

        if (procesos[i][2] > 0 && procesos[i][0] <= tiempoActual) {
            int tiempoEjecucion = Math.min(quantum, procesos[i][2]);
            procesos[i][2] -= tiempoEjecucion;
            tiempoActual += tiempoEjecucion;

            if (procesos[i][2] == 0) {
                tiemposEspera[i] = tiempoActual - procesos[i][0] - procesos[i][1];
                tiemposRespuesta[i] = tiempoActual - procesos[i][0];
                tiemposPenalizacion[i] = tiemposRespuesta[i] / (double) procesos[i][1];
                procesosCompletados++;
            } else {
                cola.add(i);
            }
        } else {
            if (procesos[i][2] > 0) {
                cola.add(i);
            }
            tiempoActual++;
        }
    }

    Muestra.append("----- Resultados Algoritmo Round Robin -----\n");
    for (int i = 0; i < num_procesos; i++) {
        Muestra.append("Proceso " + (i + 1) + " tiempo de espera: " + tiemposEspera[i] + "\n");
        Muestra.append("Proceso " + (i + 1) + " tiempo de respuesta: " + tiemposRespuesta[i] + "\n");
        Muestra.append("Proceso " + (i + 1) + " tiempo de penalización: " + tiemposPenalizacion[i] + "\n");
    }
    Muestra.append("Tiempo total de ejecución: " + tiempoActual + "\n");
}
    //Metodo para el algoritmo SRTF
    private void ejecutarSRTF(){
     int[][] procesos = new int[num_procesos][3];
        for (int i = 0; i < num_procesos; i++) {
            procesos[i][0] = tiemposLlegada.get(i);
            procesos[i][1] = tiemposCPU.get(i);
            procesos[i][2] = tiemposCPU.get(i); // Tiempo restante
        }

        int tiempoActual = 0;
        int[] tiemposEspera = new int[num_procesos];
        double[] tiemposRespuesta = new double[num_procesos];
        double[] tiemposPenalizacion = new double[num_procesos];
        boolean[] procesoCompletado = new boolean[num_procesos];
        int procesosCompletados = 0;

        while (procesosCompletados < num_procesos) {
            int procesoSeleccionado = -1;
            int tiempoMinimo = Integer.MAX_VALUE;

            for (int i = 0; i < num_procesos; i++) {
                if (!procesoCompletado[i] && procesos[i][0] <= tiempoActual && procesos[i][2] < tiempoMinimo) {
                    tiempoMinimo = procesos[i][2];
                    procesoSeleccionado = i;
                }
            }

            if (procesoSeleccionado == -1) {
                tiempoActual++;
                continue;
            }

            tiempoActual++;
            procesos[procesoSeleccionado][2]--;

            if (procesos[procesoSeleccionado][2] == 0) {
                procesoCompletado[procesoSeleccionado] = true;
                procesosCompletados++;
                tiemposEspera[procesoSeleccionado] = tiempoActual - procesos[procesoSeleccionado][0] - procesos[procesoSeleccionado][1];
                tiemposRespuesta[procesoSeleccionado] = tiempoActual - procesos[procesoSeleccionado][0];
                tiemposPenalizacion[procesoSeleccionado] = tiemposRespuesta[procesoSeleccionado] / (double) procesos[procesoSeleccionado][1];
            }
        }

        Muestra.append("----- Resultados Algoritmo SRTF -----\n");
        for (int i = 0; i < num_procesos; i++) {
            Muestra.append("Proceso " + (i + 1) + " tiempo de espera: " + tiemposEspera[i] + "\n");
            Muestra.append("Proceso " + (i + 1) + " tiempo de respuesta: " + tiemposRespuesta[i] + "\n");
            Muestra.append("Proceso " + (i + 1) + " tiempo de penalización: " + tiemposPenalizacion[i] + "\n");
        }
        Muestra.append("Tiempo total de ejecución: " + tiempoActual + "\n");
    }
//Main para llamar al panel
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JTextField Datos;
    private javax.swing.JComboBox<String> MenuAlgoritmos;
    private javax.swing.JTextArea Muestra;
    private javax.swing.JLabel Pregunta;
    private javax.swing.JTextField Recopila_cpu;
    private javax.swing.JTextField Recopila_llegada;
    private javax.swing.JTextField Recopila_prioridades;
    private javax.swing.JTextField Recopila_quantum;
    private javax.swing.JLabel Resultado;
    private javax.swing.JTextField Resultado_procesos;
    private javax.swing.JLabel Tiempo;
    private javax.swing.JLabel Tiempo1;
    private javax.swing.JLabel Tiempo2;
    private javax.swing.JLabel Tiempo3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration                   
//Declaro  variables externas
 private ArrayList<Integer> tiemposLlegada = new ArrayList<>();   
 private ArrayList<Integer> tiemposCPU = new ArrayList<>();  
 private ArrayList<Integer> prioridades=new ArrayList<>();
 private int num_procesos;
 private int contador_quantum=0;
}
