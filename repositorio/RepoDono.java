// package repositorio;

// import java.util.List;
// import a3_dao.DonoDAO;
// import models.Dono;

// public class RepoDono {
//     private List<Dono> donos;

//     public List<Dono> getAllDonos() {
//         return donos;
//     }

//     public RepoDono() {
//         donos = DonoDAO.getDonos();
//     }

//     public void criarDono() {
//         Dono d = new Dono("joaozinho", "rua tal 123", "1234", "asihudhiaus@gmail.com", "123123", "ong");
//         DonoDAO.salvarDono(d);
//         donos.add(d);
//     }

//     public void deletarDono(Dono Dono) {
//         donos.remove(Dono);
//     }

//     public void deletarDonoById(int id) {
//         Dono p = null;
//         for (Dono p1 : donos) {
//             if (p1.getId() == id) {
//                 p = p1;
//             }
//         }
//         try {
//             DonoDAO.deletarDono(p.getId());
//             donos.remove(p);
//         } catch (NullPointerException e) {
//             System.out.println("Id " + id + " não encontrado");
//         }
//     }

//     public void dono_add(Dono perfil) {
//         donos.add(perfil);
//     }
// }