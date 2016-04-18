import javax.swing.JOptionPane;

    public class equacao2grau {

      public static void main (String[]args){

        Double valorx2;
        Double valorx;
        Double valorc;
        Double delta;
        Double raiz1;
        Double raiz2;
        Double deltaquadrado;

          valorx2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X²"));
          valorx = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X"));
          valorc = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor normal"));

          delta = (valorx*valorx) - (4*valorx2*valorc);

          deltaquadrado = Math.sqrt(delta);

          raiz1 = (-valorx + deltaquadrado) / (2 * valorx2);

          JOptionPane.showMessageDialog(null,"Valor da raiz 1 eh: " + raiz1);

          raiz2 = (-valorx - deltaquadrado) / (2 * valorx2);

          JOptionPane.showMessageDialog(null,"Valor da raiz 2 eh: " + raiz2);
            
      }

    }