package br.ufjf.lp3;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

class PessoaTableModel extends AbstractTableModel {

   private final List<Pessoa> pessoas;

   public PessoaTableModel(List<Pessoa> pessoas) {
      this.pessoas = pessoas;
   }

   @Override
   public int getRowCount() {
      return pessoas.size();
   }

   @Override
   public int getColumnCount() {
      return 2;
   }

   @Override
   public Object getValueAt(int rowIndex, int columnIndex) {
      if (columnIndex == 0) {
         return pessoas.get(rowIndex).getNome();
      } else {
         return pessoas.get(rowIndex).getEmail();
      }
   }

   @Override
   public String getColumnName(int column) {
      if (column == 0) {
         return "Nome";
      } else {
         return "E-mail";
      }
   }
   
   

}
