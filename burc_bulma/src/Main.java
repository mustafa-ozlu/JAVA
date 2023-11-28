import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError=false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğdunuz Ay  :");
        month = input.nextInt();

        System.out.print("Doğdunuz Gün :");
        day = input.nextInt();
        if (month >= 1 && month <= 12) {
            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "OĞLAK";
                    } else if (day >= 22) {
                        burc = "KOVA";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 2) {
                if (day >= 1 && day <= 29) {
                    if (day < 20) {
                        burc = "KOVA";
                    } else if (day >= 20) {
                        burc = "BALIK";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "BALIK";
                    } else if (day >= 21) {
                        burc = "KOÇ";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "KOÇ";
                    } else if (day >= 21) {
                        burc = "BOĞA";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "BOĞA";
                    } else if (day >= 22) {
                        burc = "İKİZLER";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "İKİZLER";
                    } else if (day >= 23) {
                        burc = "YENGEÇ";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "YENGEÇ";
                    } else if (day >= 23) {
                        burc = "ASLAN";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 8) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "ASLAN";
                    } else if (day >= 23) {
                        burc = "BAŞAK";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 9) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "BAŞAK";
                    } else if (day >= 23) {
                        burc = "TERAZİ";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 10) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "TERAZİ";
                    } else if (day >= 23) {
                        burc = "AKREP";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 11) {
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        burc = "AKREP";
                    } else if (day >= 22) {
                        burc = "YAY";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "YAY";
                    } else if (day >= 22) {
                        burc = "OĞLAK";
                    }
                } else {
                    isError = true;
                }
            }
        }else{
            isError=true;
        }
        if (isError){
                System.out.print("Hatalı Giriş Yaptınız.");
            } else {
                System.out.print("Burcunuz : " + burc);
        }

    }
}

