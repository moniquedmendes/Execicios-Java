package modelo;

public class ValidacaoTriangulo extends AbsPropriedades
{

    public ValidacaoTriangulo(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
    }

    @Override
    public void Executar()
    {
        Estaticos.MENSAGEM = "";
        try
        {
            this.l1 = Double.parseDouble(lado1);
            this.l2 = Double.valueOf(lado2);
            this.l3 = Double.parseDouble(lado3);
            if (l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1)
            {
                Estaticos.MENSAGEM = "Não é um triângulo";
            }
        }
        catch (Exception e)
        {
            Estaticos.MENSAGEM = "Digite números válidos";
        }
    }
}
