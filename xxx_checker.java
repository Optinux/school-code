public class xxx_checker {             //entirely broken
    String textInput;
    boolean containsXXX;

    public xxx_checker(){
        this.textInput = "";
    }

    public String inputText(String textInput) {
     return textInput;
    }

    public boolean Checker(){
        if(textInput == "x"){

            if(textInput == "x"){

                if(textInput == "x"){

                    containsXXX = true;

                }else{containsXXX = false;}

            }else{containsXXX = false;}

        }else{containsXXX = false;}

    return containsXXX;
    }

    public void printResult(){
        System.out.println(containsXXX);
    }

    public static void main(String[] args) {
        xxx_checker x1 = new xxx_checker();
        x1.inputText("x");
        x1.Checker();
        x1.printResult();
    }

}
