package csvexample;

public class StockRecord {
    private String listing_id;
    private String artist;
    private String title;
    private String label;
    private String catno;
    private String format;
    private String price;
    private String listed;

    public StockRecord(String listing_id, String artist, String title, String label, String catno, String format, String price, String listed){
        this.listing_id = listing_id;
        this.artist = artist;
        this.title = title;
        this.label = label;
        this.catno = catno;
        this.format = format;
        this.price = price;
        this.listed = listed;
    }

    public String getListing_id() {
        return listing_id;
    }

    public void setListing_id(String listing_id) {
        this.listing_id = listing_id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCatno() {
        return catno;
    }

    public void setCatno(String catno) {
        this.catno = catno;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getListed() {
        return listed;
    }

    public void setListed(String listed) {
        this.listed = listed;
    }

    public String toString(){
        return "ID: " + listing_id + " Artist " + artist + " Title " + title + " Label: " + label + " Cat no: " + catno + " Format: " + format + " Price: " + price + " Listed: " + listed;
    }
}
