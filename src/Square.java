class Square extends Retangle{
    public  Square(){
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String coler,boolean filled){
        super(side,side,coler,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public String toString() {
        return "A Square with side = "+
                getSide()+
                " ,which is a subclass of  "
                +super.toString();
    }

}
