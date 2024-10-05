public class WordDocument implements Document{
    @Override
    public void create(String name){
        System.out.println("Word document " + name + " created.");
    }
}
