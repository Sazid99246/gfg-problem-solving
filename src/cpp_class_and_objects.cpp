#include <bits/stdc++.h>
using namespace std;

class CollegeCourse
{
private:
    string courseID;
    char grade;
    unsigned int credits;
    int gradePoints;
    float honorPoints;

public:
    void set_CourseId(string CID)
    {
        courseID = CID;
    }

    void set_Grade(char g)
    {
        grade = g;
    }

    void set_Credit(int cr)
    {
        credits = cr;
    }

    int calculateGradePoints(char g)
    {
        switch (g)
        {
        case 'A':
        case 'a':
            gradePoints = 10;
            break;
        case 'B':
        case 'b':
            gradePoints = 9;
            break;
        case 'C':
        case 'c':
            gradePoints = 8;
            break;
        case 'D':
        case 'd':
            gradePoints = 7;
            break;
        case 'E':
        case 'e':
            gradePoints = 6;
            break;
        case 'F':
        case 'f':
            gradePoints = 5;
            break;
        default:
            gradePoints = 0;
            break;
        }
        return gradePoints;
    }

    float calculateHonorPoints(int gp, int cr)
    {
        float honorPoints = gp * cr;
        return honorPoints;
    }

    void display()
    {
        int gradePoint = calculateGradePoints(grade);
        cout << gradePoint << " " << calculateHonorPoints(gradePoint, credits) << endl;
    }
};

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        CollegeCourse cc;
        string courseId;
        int gp;
        char grade;
        int credits;
        cin >> courseId >> grade >> credits;
        cc.set_CourseId(courseId);
        cc.set_Grade(grade);
        cc.set_Credit(credits);
        gp = cc.calculateGradePoints(grade);
        cc.calculateHonorPoints(gp, credits);
        cc.display();

        cout << "~" << "\n";
    }
    return 0;
}
