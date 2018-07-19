fun main(args:Array<String>)
{
    CallThis();
    CallThis2(76);
    CallThis2(8,"prateeti2");
    CallThis2(name="adi");
}
fun CallThis(name: String="prats", score:Number=80)
{
    println("Named arguments called: $name and $score");
}
fun CallThis2(score:Number=3, name: String="praful")
{
    println("Named arguments called: $name and $score");
}