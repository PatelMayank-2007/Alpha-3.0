public class variables {
    public static void main(String[] args) {
         int a = 10;
         int b = 5;
        System.out.println(a);
        System.out.println(b);
        String name = "Tony Stark";
        System.out.println(name);

        a = b;// b's value stored in a
        System.out.println(b);
        System.out.println(a);
    }

}
/*
#include <iostream>
#include <string>
#include <iomanip>
#include <stdexcept>
using namespace std;

// ----- MainMenu -----
class MainMenu {
    public:
    void showMenu() {
        cout << " -----------------------------------" << endl;
        cout << "|    ____        ____      _       |" << endl;
        cout << "|   / ___) ___  / ___)__ _| |__    |" << endl;
        cout << "|  | |  _ /   \\| |   / _` | '_ \\   |" << endl;
        cout << "|  | |_| |  -  | |__( (_| | (_) )  |" << endl;
        cout << "|   \\____|\\___/ \\____\\__,_|____/   |" << endl;
        cout << " -----------------------------------" << endl;
        cout << setw(23) << "Cab In Minutes" << endl;

        cout << "\nGoCab Main Menu\n";
        cout<< "|-----------------------------------|" <<endl;
        cout<< "|  Option No.  |   Function         |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |    Order Cab        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |     Cancel Cab      |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |    About us         |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     q.      |      Exit           |"<<endl;
        cout<<"|-----------------------------------|" <<endl;

        cout << "         Enter option:";
    }
};

// ----- UserDetails -----
class UserDetails {
    protected:
    string Name;
    string PhoneNumber;
    int Passenger;
    public:
    void inputUser() {
        cout << " -----------------------------------" << endl;
        cout << "|    ____        ____      _       |" << endl;
        cout << "|   / ___) ___  / ___)__ _| |__    |" << endl;
        cout << "|  | |  _ /   \\| |   / _` | '_ \\   |" << endl;
        cout << "|  | |_| |  -  | |__( (_| | (_) )  |" << endl;
        cout << "|   \\____|\\___/ \\____\\__,_|____/   |" << endl;
        cout << " -----------------------------------" << endl;
        cout << setw(23) << "Cab In Minutes" << endl;
        cout << "Enter your Name: ";
        cin >> Name;
        cout << "Enter your Phone Number: ";
        cin >> PhoneNumber;
        cout << "Enter number of passengers: ";
        cin >> Passenger;
    }
    void displayUser() {
        cout << "Name: " << Name << ", Phone Number: " << PhoneNumber << ", No. of Passengers: " << Passenger << endl;
    }
    string getName() const { return Name; }
};

// ----- Distance Calculation -----
class distCalcu {
    string sCity;
    string dCity;
    float approxDist;
    public:
    void inputdistance() {
        cout << " -----------------------------------" << endl;
        cout << "|    ____        ____      _       |" << endl;
        cout << "|   / ___) ___  / ___)__ _| |__    |" << endl;
        cout << "|  | |  _ /   \\| |   / _` | '_ \\   |" << endl;
        cout << "|  | |_| |  -  | |__( (_| | (_) )  |" << endl;
        cout << "|   \\____|\\___/ \\____\\__,_|____/   |" << endl;
        cout << " -----------------------------------" << endl;
        cout << "Enter starting city: ";
        cin >> sCity;
        cout << "Enter destination city: ";
        cin >> dCity;
        cout << "Enter approximate distance between " << sCity << " and " << dCity << " (in km): ";
        cin >> approxDist;
    }
    float getDistance() {
        return approxDist;
    }
    void displayDist() {
        cout << "Starting City: " << sCity << ", Destination City: " << dCity << ", Approx. Distance: " << approxDist << " km\n";
    }
};

// ----- Vehicle Selection -----
class VehicleSelect {
    protected:
    int vehicleChoice;
    public:
    void showVehicle() {
        cout<< "|-----------------------------------" <<endl;
        cout<<"|     __  __                        |"<<endl;
        cout<<"|    |  \\/  |___ _ _ _  _           |"<<endl;
        cout<<"|    | |\\/| / -_) ' \\ || |          |"<<endl;
        cout<<"|    |_|  |_\\___|_||_\\_,_|          |"<<endl;
        cout<< "|-----------------------------------|" <<endl;

        cout <<"\nVehicle Menu\n";
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|  Option No.  |       Vehicle      |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |    5 Seater Car     |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |    7 Seater Car     |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |   Luxury Bus        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     4.      |    Mini Bus        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;

        cout<<endl;
        cout << "     Enter option: ";
    }
    int selectVehicle() {
        cin >> vehicleChoice;
        if (vehicleChoice < 1 || vehicleChoice > 4)
            throw out_of_range("Invalid vehicle choice.");
        return vehicleChoice;
    }
};

// ----- Abstract Vehicle -----
class Vehicle {
    protected:
    int ratePerKm;
    int seatCapacity;
    string type;
    public:
    virtual void showInfo() = 0;
    int getRate() { return ratePerKm; }
    int getCapacity() { return seatCapacity; }
    string getType() const { return type; }
};

// ----- Derived Vehicles -----
class FiveSeaterCar : public Vehicle {
        string carName, brand;
public:
        FiveSeaterCar() { seatCapacity = 5; type = "Five Seater"; }
        void selectCar() {
        cout<< "|-----------------------------------|" <<endl;
        cout << "|      ___  __ _  _ __            |" << endl;
        cout << "|     / __|/ _` || '__|           |" << endl;
        cout << "|    | (__( (_| || |               |" << endl;
        cout << "|     \\___|\\__,_||_|            |" << endl;
        cout<< "|-----------------------------------" <<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|  Option No.  |       Vehicle      |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |    Swift        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |    Tigor         |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |   Punch          |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     4.      |   Curvv          |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout << "     Enter option: ";
        // cout << "Select Car:\n1. Swift\n2. Tigor\n3. Punch\n4. Curvv\nEnter choice: ";
        int choice; cin >> choice;
        switch (choice) {
        case 1:
        carName = "Swift";
        brand = "Maruti Suzuki";
        ratePerKm = 10;
        break;
        case 2:
        carName = "Tigor";
        brand = "Tata";
        ratePerKm = 11;
        break;
        case 3:
        carName = "Punch";
        brand = "Tata";
        ratePerKm = 12;
        break;
        case 4: carName = "Curvv";
        brand = "Tata";
        ratePerKm = 13;
        break;
default: cout << "Invalid choice!\n"; return;
        }
        showInfo();
        }
        void showInfo() override {
        cout << "Car: " << carName << " | Brand: " << brand << " | Type: " << type
        << " | Seats: " << seatCapacity << " | Rate/km: ₹" << ratePerKm << endl;
        }
        };

class SevenSeaterCar : public Vehicle {
        string carName, brand;
public:
        SevenSeaterCar() { seatCapacity = 7; type = "Seven Seater"; }
        void selectCar() {

        cout<< "|-----------------------------------|" <<endl;
        cout << "|      ___  __ _  _ __            |" << endl;
        cout << "|     / __|/ _` || '__|           |" << endl;
        cout << "|    | (__( (_| || |               |" << endl;
        cout << "|     \\___|\\__,_||_|            |" << endl;
        cout<< "|-----------------------------------|" <<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|  Option No.  |       Vehicle      |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |    Innova Crysta     |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |    Ertiga        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |   Marazzo        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     4.      |    Safari        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout << "     Enter option: ";
        // cout << "Select Car:\n1. Innova Crysta\n2. Ertiga\n3. Marazzo\n4. Safari\nEnter choice: ";
        int choice; cin >> choice;
        switch (choice) {
        case 1:
        carName = "Innova Crysta";
        brand = "Toyota";
        ratePerKm = 15;
        break;
        case 2:
        carName = "Ertiga";
        brand = "Maruti Suzuki";
        ratePerKm = 14;
        break;
        case 3:
        carName = "Marazzo";
        brand = "Mahindra";
        ratePerKm = 13;
        break;
        case 4:
        carName = "Safari";
        brand = "Tata";
        ratePerKm = 16;
        break;
default: cout << "Invalid choice!\n"; return;
        }
        showInfo();
        }
        void showInfo() override {
        cout << "Car: " << carName << " | Brand: " << brand << " | Type: " << type
        << " | Seats: " << seatCapacity << " | Rate/km: ₹" << ratePerKm << endl;
        }
        };

class LuxuryBus : public Vehicle {
        string busName, brand;
public:
        LuxuryBus() { seatCapacity = 40; type = "Luxury Bus"; }
        void selectBus() {
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|       ___  _ _  ___              |"<<endl;
        cout<<"|      | _ || | |/ __|             |"<<endl;
        cout<<"|      | _ \\| | |\\__ \\          |"<<endl;
        cout<<"|      |___/ \\__/|___/            |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|  Option No.  |       Vehicle      |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |   Volvo B11R     |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |    Scania Metrolink     |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |   Mercedes-Benz MultiAxle        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     4.      |    Tata Starbus Ultra        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout << "     Enter option: ";
        // cout << "Select Bus:\n1. Volvo B11R\n2. Scania Metrolink\n3. Mercedes-Benz MultiAxle\n4. Tata Starbus Ultra\nEnter choice: ";
        int choice; cin >> choice;
        switch (choice) {
        case 1:
        busName = "Volvo B11R";
        brand = "Volvo";
        ratePerKm = 35;
        break;
        case 2:
        busName = "Scania Metrolink";
        brand = "Scania";
        ratePerKm = 36;
        break;
        case 3:
        busName = "Mercedes-Benz MultiAxle";
        brand = "Mercedes-Benz";
        ratePerKm = 38;
        break;
        case 4:
        busName = "Tata Starbus Ultra";
        brand = "Tata";
        ratePerKm = 30;
        break;
default: cout << "Invalid choice!\n"; return;
        }
        showInfo();
        }
        void showInfo() override {
        cout << "Bus: " << busName << " | Brand: " << brand << " | Type: " << type
        << " | Seats: " << seatCapacity << " | Rate/km: ₹" << ratePerKm << endl;
        }
        };

class MiniBus : public Vehicle {
        string busName, brand;
public:
        MiniBus() { seatCapacity = 12; type = "Mini Bus"; }
        void selectBus() {
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|       ___  _ _  ___              |"<<endl;
        cout<<"|      | _ || | |/ __|             |"<<endl;
        cout<<"|      | _ \\| | |\\__ \\          |"<<endl;
        cout<<"|      |___/ \\__/|___/            |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|  Option No.  |       Vehicle      |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |   Traveller     |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |    Winger     |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |   Supro Van       |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     4.      |    MiTR       |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout << "     Enter option: ";
        // cout << "Select Bus:\n1. Traveller\n2. Winger\n3. Supro Van\n4. MiTR\nEnter choice: ";
        int choice; cin >> choice;
        switch (choice) {
        case 1:
        busName = "Traveller";
        brand = "Force Motors";
        ratePerKm = 18;
        break;
        case 2:
        busName = "Winger";
        brand = "Tata";
        ratePerKm = 17;
        break;
        case 3:
        busName = "Supro Van";
        brand = "Mahindra";
        ratePerKm = 16;
        break;
        case 4:
        busName = "MiTR";
        brand = "Ashok Leyland";
        ratePerKm = 19;
        break;
default: cout << "Invalid choice!\n"; return;
        }
        showInfo();
        }
        void showInfo() override {
        cout << "Bus: " << busName << " | Brand: " << brand << " | Type: " << type
        << " | Seats: " << seatCapacity << " | Rate/km: ₹" << ratePerKm << endl;
        }
        };

// ----- CancelCab -----
class CancelCab {
    public:
    void cancelBooking(int bookingID, int currentBookingID, bool &isBooked) {
        if (!isBooked) {
            cout << "No booking exists to cancel.\n";
        } else if (bookingID == currentBookingID) {
            cout << "Booking ID " << bookingID << " has been canceled successfully.\n";
            isBooked = false;
        } else {
            cout << "Invalid Booking ID.\n";
        }
    }
};

// ----- Bill Generation -----
class Bill {
    static int bookingCounter;
    int bookingID;
    string userName;
    string vehicleType;
    float distance;
    int ratePerKm;
    float totalFare;
    public:
    Bill(string name, string vType, float dist, int rate)
        : userName(name), vehicleType(vType), distance(dist), ratePerKm(rate) {
        bookingID = ++bookingCounter;
        totalFare = distance * ratePerKm;
    }

    void generateBill() {
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     ___ _ _ _                    |"<<endl;
        cout<<"|    | _ |_) | |                  |"<<endl;
        cout<<"|    | _ \\ | | |                  |"<<endl;
        cout<<"|    |___/_|_|_|                    |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout << "\n----- Booking Bill -----\n";
        cout << "Booking ID: " << bookingID << endl;
        cout << "Name: " << userName << endl;
        cout << "Vehicle Type: " << vehicleType << endl;
        cout << "Distance: " << distance << " km" << endl;
        cout << "Rate per Km: ₹" << ratePerKm << endl;
        cout << "Total Fare: ₹" << totalFare << endl;
        cout << "Booking Confirmed!\n";
        cout << "------------------------\n";
    }

    int getBookingID() const {
        return bookingID;
    }
};

int Bill::bookingCounter = 1234;

// ----- Logo -----
        void gocab() {
        cout << " -----------------------------------" << endl;
        cout << "|    ____        ____      _       |" << endl;
        cout << "|   / ___) ___  / ___)__ _| |__    |" << endl;
        cout << "|  | |  _ /   \\| |   / _` | '_ \\   |" << endl;
        cout << "|  | |_| |  -  | |__( (_| | (_) )  |" << endl;
        cout << "|   \\____|\\___/ \\____\\__,_|____/   |" << endl;
        cout << " -----------------------------------" << endl;
        cout << setw(23) << "Cab In Minutes" << endl;
        }

// ----- Main -----
        int main() {
        MainMenu menu;
        UserDetails user;
        distCalcu distance;
        VehicleSelect vehicleSelect;
        CancelCab cancelCab;

        bool isBooked = false;
        int currentBookingID = 0;

        char option;
        do {
        menu.showMenu();
        cin >> option;

        if (option == '1') {
        user.inputUser();
        distance.inputdistance();
        distance.displayDist();

        vehicleSelect.showVehicle();
        try {
        int vChoice = vehicleSelect.selectVehicle();
        Vehicle* vPtr = nullptr;

        switch (vChoice) {
        case 1: {
        FiveSeaterCar car;
        car.selectCar();
        vPtr = &car;
        break;
        }
        case 2: {
        SevenSeaterCar car;
        car.selectCar();
        vPtr = &car;
        break;
        }
        case 3: {
        LuxuryBus bus;
        bus.selectBus();
        vPtr = &bus;
        break;
        }
        case 4: {
        MiniBus bus;
        bus.selectBus();
        vPtr = &bus;
        break;
        }
        }

        if (vPtr != nullptr) {
        Bill bill(user.getName(), vPtr->getType(), distance.getDistance(), vPtr->getRate());
        bill.generateBill();
        currentBookingID = bill.getBookingID();
        isBooked = true;
        }

        } catch (const out_of_range &e) {
        cout << e.what() << endl;
        }
        } else if (option == '2') {
        int bookingID;
        cout << "Enter your Booking ID to cancel: ";
        cin >> bookingID;
        cancelCab.cancelBooking(bookingID, currentBookingID, isBooked);
        } else if (option == '3') {
        cout << "GoCab - Best Cab Service Provider in Your City!" << endl;
        }

        } while (option != 'q' && option != 'Q');

        cout << "Thank you for using GoCab!" << endl;
        return 0;
        }

 */

/*#include <iostream>
#include <string>
#include <iomanip>
//#include <stdexcept>
//#include <cstdlib>
using namespace std;

// -+-+-+-+ MainMenu -+-+-+-+
class MainMenu {
    public:
    void showMenu() {
        cout << " -----------------------------------" << endl;
        cout << "|    ____        ____      _       |" << endl;
        cout << "|   / ___) ___  / ___)__ _| |__    |" << endl;
        cout << "|  | |  _ /   \\| |   / _` | '_ \\   |" << endl;
        cout << "|  | |_| |  -  | |__( (_| | (_) )  |" << endl;
        cout << "|   \\____|\\___/ \\____\\__,_|____/   |" << endl;
        cout << " -----------------------------------" << endl;
        cout << setw(25) << "Cab In Minutes" << endl;
        cout << " -----------------------------------" << endl;
        cout << "|         GoCab Main Menu           |\n";
        cout<< "|-----------------------------------|" <<endl;
        cout<< "|  Option No.  |   Function         |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |    Order Cab        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |     Cancel Cab      |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |    About us         |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     q.      |      Exit           |"<<endl;
        cout<<"|-----------------------------------|" <<endl;

        cout << "         Enter option:";
    }
};

// -+-+-+-+ UserDetails -+-+-+-+
class UserDetails {
    protected:
    string Name;
    string PhoneNumber;
    int Passenger;
    public:
    void inputUser() {
        cout << " -----------------------------------" << endl;
        cout << "|    ____        ____      _       |" << endl;
        cout << "|   / ___) ___  / ___)__ _| |__    |" << endl;
        cout << "|  | |  _ /   \\| |   / _` | '_ \\   |" << endl;
        cout << "|  | |_| |  -  | |__( (_| | (_) )  |" << endl;
        cout << "|   \\____|\\___/ \\____\\__,_|____/   |" << endl;
        cout << " -----------------------------------" << endl;
        cout << setw(23) << "Cab In Minutes" << endl;

        while (true) {
            try {
                cout << "Enter your Name: ";
                cin >> Name;
                bool allNumbers = true;
                for (char c : Name) {
                    if (c < '0' || c > '9') {
                        allNumbers = false;
                        break;
                    }
                }
                if (allNumbers) {
                    throw "Name cannot be in numbers.";
                }
                break;
            } catch (const char* msg) {
                cout << "Error: " << msg << " Please enter a valid name.\n";
            }
        }

        cout << "Enter your Phone Number: ";
        cin >> PhoneNumber;

        cout << "Enter number of passengers: ";
        cin >> Passenger;
    }

    string getName() const {
        return Name;
    }
};

// -+-+-+-+ Distance Calculation -+-+-+-+
class distCalcu {
    string sCity;
    string dCity;
    float approxDist;
    public:
    void inputdistance() {
        cout << " -----------------------------------" << endl;
        cout << "|    ____        ____      _       |" << endl;
        cout << "|   / ___) ___  / ___)__ _| |__    |" << endl;
        cout << "|  | |  _ /   \\| |   / _` | '_ \\   |" << endl;
        cout << "|  | |_| |  -  | |__( (_| | (_) )  |" << endl;
        cout << "|   \\____|\\___/ \\____\\__,_|____/   |" << endl;
        cout << " -----------------------------------" << endl;

        while (true) {
            try {
                cout << "Enter your pickup location: ";
                cin >> sCity;
                bool allNumbers = true;
                for (char c : sCity) {
                    if (c < '0' || c > '9') {
                        allNumbers = false;
                        break;
                    }
                }
                if (allNumbers) {
                    throw "Pickup location cannot be in numbers.";
                }
                break;
            } catch (const char* msg) {
                cout << "Error: " << msg << " Please enter a valid location.\n";
            }
        }

        while (true) {
            try {
                cout << "Enter your drop location: ";
                cin >> dCity;
                bool allNumbers = true;
                for (char c : dCity) {
                    if (c < '0' || c > '9') {
                        allNumbers = false;
                        break;
                    }
                }
                if (allNumbers) {
                    throw "Drop location cannot be in numbers.";
                }
                break;
            } catch (const char* msg) {
                cout << "Error: " << msg << " Please enter a valid location.\n";
            }
        }

        cout << "Enter approximate distance between " << sCity << " and " << dCity << " (in km): ";
        cin >> approxDist;
    }

    float getDistance() {
        return approxDist;
    }
    void displayDist() {
        cout << "Starting City: " << sCity << ", Destination City: " << dCity << ", Approx. Distance: " << approxDist << " km\n";
    }
};



// -+-+-+-+ Vehicle Selection -+-+-+-+
class VehicleSelect {
    protected:
    int vehicleChoice;
    public:
    void showVehicle() {
        system("clear");
        cout<< "|-----------------------------------" <<endl;
        cout<<"|     __  __                        |"<<endl;
        cout<<"|    |  \\/  |___ _ _ _  _           |"<<endl;
        cout<<"|    | |\\/| / -_) ' \\ || |          |"<<endl;
        cout<<"|    |_|  |_\\___|_||_\\_,_|          |"<<endl;
        cout<< "|-----------------------------------|" <<endl;

        cout <<"\nVehicle Menu\n";
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|  Option No.  |       Vehicle      |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |    5 Seater Car     |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |    7 Seater Car     |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |   Luxury Bus        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     4.      |    Mini Bus         |"<<endl;
        cout<<"|-----------------------------------|" <<endl;

        cout<<endl;
        cout << "     Enter option: ";
    }
    int selectVehicle() {
        cin >> vehicleChoice;
        if (vehicleChoice < 1 || vehicleChoice > 4)
            throw out_of_range("Invalid vehicle choice.");
        return vehicleChoice;
    }
};

// -+-+-+-+ Abstract Vehicle -+-+-+-+
class Vehicle {
    protected:
    int ratePerKm;
    int seatCapacity;
    string type;
    public:
    virtual void showInfo() = 0;
    int getRate() {
        return ratePerKm;
    }
    int getCapacity() {
        return seatCapacity;
    }
    string getType() const {
        return type;
    }
};

// -+-+-+-+ Derived Vehicles -+-+-+-+
class FiveSeaterCar : public Vehicle {
        string carName, brand;
public:
        FiveSeaterCar() {
        seatCapacity = 5;
        type = "Five Seater";
        }
        void selectCar() {
        system("clear");
        cout<< "|-----------------------------------|" <<endl;
        cout << "|      ___  __ _  _ __              |" << endl;
        cout << "|     / __|/ _` || '__|             |" << endl;
        cout << "|    | (__( (_| || |                |" << endl;
        cout << "|     \\___|\\__,_||_|                |" << endl;
        cout<< "|-----------------------------------" <<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|  Option No.  |       Vehicle      |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |    Swift            |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |    Tigor            |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |   Punch             |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     4.      |   Curvv             |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout << "     Enter option: ";

        int choice; cin >> choice;
        switch (choice) {
        case 1:
        carName = "Swift";
        brand = "Maruti Suzuki";
        ratePerKm = 10;
        break;
        case 2:
        carName = "Tigor";
        brand = "Tata";
        ratePerKm = 11;
        break;
        case 3:
        carName = "Punch";
        brand = "Tata";
        ratePerKm = 12;
        break;
        case 4: carName = "Curvv";
        brand = "Tata";
        ratePerKm = 13;
        break;
default: cout << "Invalid choice!\n"; return;
        }
        showInfo();
        }
        void showInfo() override {
        cout << "Car: " << carName << " | Brand: " << brand << " | Type: " << type
        << " | Seats: " << seatCapacity << " | Rate/km: ₹" << ratePerKm << endl;
        }
        };

class SevenSeaterCar : public Vehicle {
        string carName, brand;
public:
        SevenSeaterCar() {
        seatCapacity = 7;
        type = "Seven Seater";
        }
        void selectCar() {
        system("clear");
        cout<< "|-----------------------------------|" <<endl;
        cout << "|      ___  __ _  _ __              |" << endl;
        cout << "|     / __|/ _` || '__|             |" << endl;
        cout << "|    | (__( (_| || |                |" << endl;
        cout << "|     \\___|\\__,_||_|                |" << endl;
        cout<< "|-----------------------------------|" <<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|  Option No.  |       Vehicle      |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |    Innova Crysta    |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |    Ertiga           |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |   Marazzo           |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     4.      |    Safari           |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout << "     Enter option: ";

        int choice;
        cin >> choice;
        switch (choice) {
        case 1:
        carName = "Innova Crysta";
        brand = "Toyota";
        ratePerKm = 15;
        break;
        case 2:
        carName = "Ertiga";
        brand = "Maruti Suzuki";
        ratePerKm = 14;
        break;
        case 3:
        carName = "Marazzo";
        brand = "Mahindra";
        ratePerKm = 13;
        break;
        case 4:
        carName = "Safari";
        brand = "Tata";
        ratePerKm = 16;
        break;
default: cout << "Invalid choice!\n"; return;
        }
        showInfo();
        }
        void showInfo() override {
        cout << "Car: " << carName << " | Brand: " << brand << " | Type: " << type
        << " | Seats: " << seatCapacity << " | Rate/km: ₹" << ratePerKm << endl;
        }
        };

class LuxuryBus : public Vehicle {
        string busName, brand;
public:
        LuxuryBus() {
        seatCapacity = 40;
        type = "Luxury Bus";
        }
        void selectBus() {
        system("clear");
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|       ___  _ _  ___               |"<<endl;
        cout<<"|      | _ || | |/ __|              |"<<endl;
        cout<<"|      | _ \\| | |\\__ \\              |"<<endl;
        cout<<"|      |___/ \\__/|___/              |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|  Option No.  |       Vehicle      |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |   Volvo B11R        |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |    Scania Metrolink |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |   Mercedes          |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     4.      |    Tata Starbus     |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout << "     Enter option: ";
        // cout << "Select Bus:\n1. Volvo B11R\n2. Scania Metrolink\n3. Mercedes-Benz MultiAxle\n4. Tata Starbus Ultra\nEnter choice: ";
        int choice; cin >> choice;
        switch (choice) {
        case 1:
        busName = "Volvo B11R";
        brand = "Volvo";
        ratePerKm = 35;
        break;
        case 2:
        busName = "Scania Metrolink";
        brand = "Scania";
        ratePerKm = 36;
        break;
        case 3:
        busName = "Mercedes";
        brand = "Mercedes";
        ratePerKm = 38;
        break;
        case 4:
        busName = "Tata Starbus Ultra";
        brand = "Tata";
        ratePerKm = 30;
        break;
default: cout << "Invalid choice!\n"; return;
        }
        showInfo();
        }
        void showInfo() override {
        cout << "Bus: " << busName << " | Brand: " << brand << " | Type: " << type
        << " | Seats: " << seatCapacity << " | Rate/km: ₹" << ratePerKm << endl;
        }
        };

class MiniBus : public Vehicle {
        string busName, brand;
public:
        MiniBus() {
        seatCapacity = 12;
        type = "Mini Bus";
        }
        void selectBus() {
        system("clear");
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|       ___  _ _  ___               |"<<endl;
        cout<<"|      | _ || | |/ __|              |"<<endl;
        cout<<"|      | _ \\| | |\\__ \\              |"<<endl;
        cout<<"|      |___/ \\__/|___/              |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|  Option No.  |       Vehicle      |"<<endl;
        cout<< "|-----------------------------------|" <<endl;
        cout <<"|     1.      |   Traveller         |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout<<"|     2.      |    Winger           |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     3.      |   Supro Van         |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout <<"|     4.      |    MiTR             |"<<endl;
        cout<<"|-----------------------------------|" <<endl;
        cout << "     Enter option: ";
        // cout << "Select Bus:\n1. Traveller\n2. Winger\n3. Supro Van\n4. MiTR\nEnter choice: ";
        int choice; cin >> choice;
        switch (choice) {
        case 1:
        busName = "Traveller";
        brand = "Force Motors";
        ratePerKm = 18;
        break;
        case 2:
        busName = "Winger";
        brand = "Tata";
        ratePerKm = 17;
        break;
        case 3:
        busName = "Supro Van";
        brand = "Mahindra";
        ratePerKm = 16;
        break;
        case 4:
        busName = "MiTR";
        brand = "Ashok Leyland";
        ratePerKm = 19;
        break;
default: cout << "Invalid choice!\n"; return;
        }
        showInfo();
        }
        void showInfo() override {
        cout << "Bus: " << busName << " | Brand: " << brand << " | Type: " << type
        << " | Seats: " << seatCapacity << " | Rate/km: ₹" << ratePerKm << endl;
        }
        };

// ----- CancelCab -----
class CancelCab {
    public:
    void cancelBooking(int bookingID, int currentBookingID, bool &isBooked) {
        if (!isBooked) {
            cout << "No booking exists to cancel.\n";
        } else if (bookingID == currentBookingID) {
            cout << "Booking ID " << bookingID << " has been canceled successfully.\n";
            isBooked = false;
        } else {
            cout << "Invalid Booking ID.\n";
        }
    }
};

// -+-+-+-+ Bill Generation -+-+-+-+
class Bill {
    static int bookingCounter;
    int bookingID;
    string userName;
    string vehicleType;
    float distance;
    int ratePerKm;
    float totalFare;
    public:
    Bill(string name, string vType, float dist, int rate)
        : userName(name), vehicleType(vType), distance(dist), ratePerKm(rate) {
        bookingID = ++bookingCounter;
        totalFare = distance * ratePerKm;
    }


    void generateBill() {
        system("clear");
        cout << " -----------------------------------" << endl;
        cout << "|         ___ _ _ _               |" << endl;
        cout << "|        | _ |_) | |              |" << endl;
        cout << "|        | _ \\ | | |              |" << endl;
        cout << "|        |___/_|_|_|              |" << endl;
        cout << " -----------------------------------" << endl;
        cout << "\n----- Booking Bill -----" << endl;
        cout << " --------------------------" << endl;
        cout << "| Booking ID: " << setw(13) << left << bookingID << "  |" << endl;
        cout << "| Name: " << setw(20) << left << userName << " |" << endl;
        cout << "| Vehicle Type: " << setw(12) << left << vehicleType << " |" << endl;
        cout << "| Distance: " << left << distance << " km" << setw(13) << right << " |" << endl;
        cout << "| Rate per Km: " << setw(10) << left << ratePerKm << "    |" << endl;
        cout << "| Total Fare: " << setw(11) << left << totalFare << "    |" << endl;
        cout << " --------------------------" << endl;
        cout << "| Booking Confirmed!      |" << endl;
        cout << " --------------------------" << endl;

    }
    int getBookingID() const {
        return bookingID;
    }
};

int Bill::bookingCounter = 1234;

// -+-+-+-+ Logo -+-+-+-+
        void gocab() {
        cout << " -----------------------------------" << endl;
        cout << "|    ____        ____      _       |" << endl;
        cout << "|   / ___) ___  / ___)__ _| |__    |" << endl;
        cout << "|  | |  _ /   \\| |   / _` | '_ \\   |" << endl;
        cout << "|  | |_| |  -  | |__( (_| | (_) )  |" << endl;
        cout << "|   \\____|\\___/ \\____\\__,_|____/   |" << endl;
        cout << " -----------------------------------" << endl;
        cout << setw(23) << "Cab In Minutes" << endl;
        }


// -+-+-+-+ Main -+-+-+-+-
        int main() {
        MainMenu menu;
        UserDetails user;
        distCalcu distance;
        VehicleSelect vehicleSelect;
        CancelCab cancelCab;

        bool isBooked = false;
        int currentBookingID = 0;

        char option;
        do {
        menu.showMenu();
        cin >> option;

        if (option == '1') {
        system("clear");
        user.inputUser();
        system("clear");
        distance.inputdistance();
        system("clear");
        distance.displayDist();
        system("clear");

        vehicleSelect.showVehicle();
        try {
        int vChoice = vehicleSelect.selectVehicle();
        string vehicleType;
        double rate = 0.0;

        // Simple error handling for vehicle selection
        if(vChoice < 1 || vChoice > 4) {
        throw "Invalid vehicle choice! Please select 1-4";
        }

        switch (vChoice) {
        case 1: {
        FiveSeaterCar car;
        car.selectCar();
        vehicleType = car.getType();
        rate = car.getRate();
        break;
        }
        case 2: {
        SevenSeaterCar car;
        car.selectCar();
        vehicleType = car.getType();
        rate = car.getRate();
        break;
        }
        case 3: {
        LuxuryBus bus;
        bus.selectBus();
        vehicleType = bus.getType();
        rate = bus.getRate();
        break;
        }
        case 4: {
        MiniBus bus;
        bus.selectBus();
        vehicleType = bus.getType();
        rate = bus.getRate();
        break;
        }
        }

        Bill bill(user.getName(), vehicleType, distance.getDistance(), rate);
        bill.generateBill();
        currentBookingID = bill.getBookingID();
        isBooked = true;

        } catch (const char* errorMsg) {
        cout << "Error: " << errorMsg << endl;
        } catch (...) {
        cout << "An unexpected error occurred!" << endl;
        }

        } else if (option == '2') {
        int bookingID;
        cout << "Enter your Booking ID to cancel: ";
        cin >> bookingID;
        cancelCab.cancelBooking(bookingID, currentBookingID, isBooked);
        } else if (option == '3') {
        cout << "Welcome to GoCab – your trusted partner for fast, reliable, and affordable cab services!\n"
        << "At GoCab, we prioritize safety, comfort, and convenience to make your travel seamless.\n"
        << "Whether you need a quick ride across town or a spacious vehicle for group travel,\n"
        << "our diverse fleet (from 5-seaters to luxury buses) ensures the perfect fit for every journey.\n";
        }

        } while (option != 'q' && option != 'Q');

        cout << "Thank you for using GoCab!" << endl;
        return 0;
        }
*/




