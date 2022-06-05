public class Main{
    public static void main (String [] args) {
        // Interface para criação de nome e status do Tamagotchi
         System.out.println ("Crie seu Tamagotchi: ");
         String nome = Teclado.leString ("Digite o nome de seu novo companheiro: ");
         int peso = 10;
         int sono = 0;
         int fome = 0;
         int exercicio = 0;
         int idade = 0;
                  
        while (peso <= 20 && idade < 15) {
        int random = (int)(Math.random() * 3)+1;
            //Ações do Tamagotchi
            // 1 = Tamogotchi irá fazer ações relacionadas ao sono.
            if (random == 1){
                System.out.println(nome + ": Estou com sono...\n O que você irá fazer?" );
                // Opções de sono:
                int sonoTamagotchi = Teclado.leInt (nome + " está cansado, selecione uma das opções para ele: \n 1)Ir dormir \n 2)Ficar acordado " );
                    if (sonoTamagotchi == 1) {
                        System.out.println(nome + ": Vou ir descansar um pouco, até depois! \n" + nome + " está dormindo.");
                        idade++;
                        System.out.println (nome + ": Parabéns para mim! \n" + nome + " se tornou mais velho, ele possui: " + idade + " ano (s)");
                        // Se chegar a 15 anos/dias ele irá morrer
                        if (idade == 15) {
                            System.out.println (nome + ": Foi muito legal te conhecer... espero que possamos nos ver novamente ;-; \n" + nome + " infelizmente morreu, mas foi feliz ao seu lado...");
                            break;
                        }
                    }
                    else if (sonoTamagotchi == 2) {
                        System.out.println(nome + ": Irei ficar acordado até mais tarde com você hoje ^^)/ \n" + nome + " permanecerá acordado como desejado por você.");
                        sono ++;
                        // Caso ele tente ficar acordado 5 vezes, irá dormir automaticamente e aumentará 1 de idade.
                        if (sono >=5) {
                            System.out.println(nome + ": E-eu tô muito cansado... zzz \n" + nome + " acabou dormindo por conta do cansaço.");
                            idade ++;
                            System.out.println (nome + ": Parabéns para mim! \n" + nome + " se tornou mais velho, ele possui: " + idade + " ano (s)");
                        }
                          // Se chegar a 15 anos/dias ele irá morrer
                        if (idade == 15) {
                            System.out.println (nome + ": Foi muito legal te conhecer... espero que possamos nos ver novamente ;-; \n" + nome + " infelizmente morreu, mas foi feliz ao seu lado...");
                            break;
                        }
                    }
                }
                    // 2 = Fome do Tamagotchi
            else if (random == 2) {
                 System.out.println(nome + ": Estou com fome...\n O que você irá fazer?" );
                 //Menu para alimentar o Tamagotchi
                 int fomeTamagotchi = Teclado.leInt (nome + " está com fome, selecione uma das opções para ele: \n 1)Comer pouco \n 2)Comer muito \n 3)Não comer " );
                    if (fomeTamagotchi == 1) {
                     System.out.println(nome + ": Vou comer um pouco! \n" + nome + " está comendo.");
                     //Quando o Tamagotchi come ele ganha peso e perde fome. 
                     //Quando o Tamagotchi não come, ele perde peso e ganha fome.
                     peso++;
                     fome --;
                     System.out.println (nome + ": Me sinto um pouco pesado... \n" + nome + " se tornou mais pesado, ele possui: " + peso + " kg (s) \n e sua fome é: " + fome);
                    }
                    // Se o Tamagotchi tiver 20 kg, ele irá morrer e o código encerra.
                      if (peso >= 20) {
                            System.out.println (nome + ": Foi muito legal te conhecer... e-eu... \n" + nome + " BOOM! Seu companheiro explodiu e infelizmente morreu...");
                            break;
                        }
                    if (fomeTamagotchi == 2) {
                        // Se o Tamagotchi comer muito, ele ganhará 5 kg e irá dormir automaticamente, logo aumentando 1 ano de idade
                        System.out.println(nome + ": Vou comer muito agora! \n" + nome + " está comendo muito");
                        peso++;
                        peso++;
                        peso++;
                        peso++;
                        peso++;
                        sono ++;
                        sono ++;
                        sono ++;
                        sono ++;
                        sono ++;
                        fome--;
                        fome--;
                        fome--;
                        
                        if (sono >=5) {
                            System.out.println(nome + ": E-eu tô muito cansado... zzz \n" + nome + " acabou dormindo por conta do cansaço.");
                            idade ++;
                            System.out.println (nome + ": Parabéns para mim! \n" + nome + " se tornou mais velho, ele possui: " + idade + " ano (s)");
                        }
                        System.out.println (nome + ": Me sinto muito pesado... \n" + nome + " se tornou mais pesado, ele possui: " + peso + " kg (s) \n e sua fome é: " + fome);
                        if (peso >= 20) {
                            System.out.println (nome + ": Foi muito legal te conhecer... e-eu... \n" + " BOOM! Seu companheiro explodiu e infelizmente morreu...");
                            break;
                        }

                    }
                else if (fomeTamagotchi == 3) {
                    System.out.println(nome + ": Hoje não irei comer! \n" + nome + " está com fome.");
                    // Tamagotchi diminui o peso em 2 e aumenta 1 de fome
                    peso--; 
                    peso--;
                    fome++;
                    System.out.println (nome + ": Fome... \n" + nome + " perdeu muitos quilos, ele possui: " + peso + " kg (s) \n e sua fome é: " + fome);
                        // Aqui se o Tamagotchi tiver 0 kg, ele morrerá. No entanto se ele tiver com 10 de fome (Ou seja, se você não alimentar ele) vai morrer.
                        if (peso == 0 || fome == 10) {
                            System.out.println (nome + ": Eu só queria comida... \n" + nome + " Seu companheiro se tornou apenas ossos e morreu de fome.");
                            break;
                        }
                        }
            }
            // 3 = Correr e caminhar
            else if (random == 3) {
                System.out.println(nome + ": Quero correr! \n  O que você irá fazer?");
                // Opções para correr e caminhar
                int exercicioTamagotchi = Teclado.leInt (nome+ " está entediado, selecione uma das opções para ele: \n 1)Correr \n 2)Caminhar ");
                    if (exercicioTamagotchi == 1) {
                    System.out.println(nome + ": Hora de me exercitar! \n" +nome + " foi correr por 10 minutos");
                    // Se o tamagotchi correr por 10 minutos, ele perderá 4kg e aumentará 2 de fome.
                    peso --;
                    peso --;
                    peso --;
                    peso --;
                    fome ++;
                    fome ++;
                    System.out.println (nome + ": Estou cansado, um rango agora iria cair bem... \n" + nome + " perdeu muitos quilos, ele possui: " + peso + " kg (s) \n e sua fome é: " + fome);
                    // Se ele chegar a 0kg correndo, vai morrer de fome.
                        if (peso == 0){
                            System.out.println(nome + ": Acho que corri demais... \n" + nome + " Seu companheiro se tornou apenas ossos e morreu de fome.");
                            break; 
                        }
                    }
                    else if (exercicioTamagotchi == 2) {
                    System.out.println(nome + ": Hora de me exercitar! \n" +nome + " foi caminhar por 10 minutos");
                    // Se o tamagotchi caminhar, ele vai perder 1kg e vai ficar com 1 de fome.
                    peso --;
                    fome ++;
                    System.out.println (nome + ": Foi uma caminhada legal, um petisco agora iria cair bem... \n" + nome + " perdeu 1 quilo, ele possui: " + peso + " kg (s) \n e sua fome é: " + fome);
                        if (peso == 0){
                            // Se ele caminhar demais e perder todo peso, irá morrer.
                            System.out.println(nome + ": Acho que caminhei demais e esqueci de descansar... \n" + nome + " Seu companheiro se tornou apenas ossos e morreu de fome.");
                            break; 
                        }
                    }
                }
            }
    }    
}

       

