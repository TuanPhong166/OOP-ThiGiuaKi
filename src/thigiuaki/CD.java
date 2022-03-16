package thigiuaki;

public class CD {
    //emplementation - che giấu
    //attribute
    private int maCD ; 
    private String nameCD ;
    private String singer ;
    private int numberTheSong ;
    private double price ;
    //interface - bộc lộ
    // method
    public CD(){
        // ham tạo mặc định
    }


    public CD(int maCD , String nameCD , String singer , int numberTheSong,double price ){
        this.maCD = maCD ;
        this.nameCD = nameCD ;
        this.singer = singer ;
        this.numberTheSong = numberTheSong ;
        this.price = price ;
    }
    // setter va getter
    public int getMaCD(){
        return this.maCD ;
    }
    public void setMaCD(int maCD){
        this.maCD = maCD ;
    }

    public String getNameCD(){
        return this.nameCD ;
    }
    public void setNamCD(String nameCD){
        this.nameCD = nameCD ;
    }

    public String getSinger (){
        return this.singer ;
    }
    public void setSinger(String singer){
        this.singer = singer ;
    }

    public int getNumberTheSong(){
        return this.numberTheSong ;
    }
    public void setNumberTheSong(int numberTheSong){
        this.numberTheSong = numberTheSong ;
    }
    // Phong 2005110008
    public double getPrice(){
        return this.price ;
    }

    public void setPrice(double price){
        this.price = price ;
    }

    @Override
    public String toString(){
        String str = "Ma CD: "+this.maCD ;
        str = str + ". Ten CD: "+ this.nameCD +". Ten Ca Si: "+this.singer ;
        str = str + ". So luong bai hat: "+this.numberTheSong +". Gia Thanh: "+this.price;
        return str ;
    }


    public void inThongTin(){
        System.out.println("CD Code: "+this.maCD);
        System.out.println("Name CD: "+this.nameCD);
        System.out.println("The singer name: "+this.singer);
        System.out.println("The number song: "+this.numberTheSong);
        System.out.println("CD price: "+this.price) ;
    }

    

    
}
