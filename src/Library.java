 class Library <T> {
     T value;
     String title;
     double cost;

     Library(T value, String title, double cost) {
         this.value = value;
         this.title = title;
         this.cost = cost;
     }

     void printlist() {
         if (value.equals("book")) {
             System.out.println("the book name is :" + title + "the cost of the book is :" + cost);
         } else if (value.equals("1")) {
             System.out.println("the video name is :" + title + "the cost of that video :" + cost);
         } else {
             System.out.println("the newspaper is :" + title + "the cost of one newspaper is :" + cost);
         }
     }


     public static void main(String[] args) {
         Library l1 = new Library("book", "mahabharat", 250);
         Library l2 = new Library(1 ,"songs", 300);
         Library l3 = new Library(1.2f, "the hindu", 5);
         l1.printlist();
         l2.printlist();
         l3.printlist();

     }
 }
 class LibraryOne {
     String value;
     String title;
     double cost;

     LibraryOne(String value, String title, double cost)
     {
         this.value = value;
         this.title = title;
         this.cost = cost;
     }
     void printlist() {
         if (value.equals("book")) {
             System.out.println("the book name is :" + title + "the cost of the book is :" + cost);
         } else if (value.equals("video")) {
             System.out.println("the video name is :" + title + "the cost of that video :" + cost);
         } else {
             System.out.println("the newspaper is :" + title + "the cost of one newspaper is :" + cost);
         }
     }

     public static void main(String[] args)
     {
         LibraryOne l1=new LibraryOne("book","mahabharat", 250);
         LibraryOne l2=new LibraryOne("video","songs", 300);
         LibraryOne l3=new LibraryOne("newspaper","the hindu", 5);
         l1.printlist();
         l2.printlist();
         l3.printlist();
     }

 }


