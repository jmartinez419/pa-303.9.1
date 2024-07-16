package methodOverriding2;

public class motorcycle extends cycle{
    @Override
    String desciption(){
        return   "Hello I am a motorcycle, I am a cycle with an engine.\n " + super.desciption();
    }
}
