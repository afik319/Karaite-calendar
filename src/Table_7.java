 


/**
 * Write a description of class table_7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Table_7
{
    static final int ZODIAC_COMPLEMENT = 11;
    static final int DEGREES_COMPLEMENT = 30;
    static final double table_7[][] = {
        {56, 5,16, 6,37, 6,51, 6,46, 6,19, 6,37, 5, 4, 5,41, 4,43, 4, 7, 5,34, 5},
        {56, 5,18, 6,37, 6,52, 6,46, 6,18, 6,36, 5, 2, 5,41, 4,43, 4, 8, 5,35, 5},
        {57, 5,19, 6,38, 6,52, 6,45, 6,17, 6,35, 5, 1, 5,41, 4,44, 4, 9, 5,35, 5},
        {57, 5,19, 6,38, 6,52, 6,44, 6,15, 6,34, 5, 0, 5,40, 4,45, 4,10, 5,35, 5},
        {58, 5,20, 6,39, 6,52, 6,44, 6,14, 6,33, 5,59, 4,40, 4,45, 4,11, 5,36, 5},
        {59, 5,20, 6,39, 6,52, 6,43, 6,12, 6,32, 5,59, 4,40, 4,46, 4,12, 5,37, 5},
        {59, 5,21, 6,40, 6,52, 6,43, 6,10, 6,31, 5,58, 4,39, 4,46, 4,12, 5,38, 5},
        { 0, 6,22, 6,41, 6,52, 6,42, 6, 9, 6,30, 5,57, 4,39, 4,47, 4,13, 5,39, 5},
        { 0, 6,23, 6,41, 6,52, 6,41, 6, 7, 6,28, 5,56, 4,39, 4,48, 4,14, 5,39, 5},
        { 1, 6,24, 6,42, 6,52, 6,40, 6, 6, 6,27, 5,55, 4,39, 4,48, 4,15, 5,40, 5},
        { 1, 6,24, 6,42, 6,52, 6,40, 6, 4, 6,26, 5,54, 4,39, 4,49, 4,16, 5,41, 5},
        { 2, 6,25, 6,43, 6,52, 6,39, 6, 3, 6,25, 5,53, 4,39, 4,50, 4,17, 5,42, 5},
        { 3, 6,26, 6,43, 6,52, 6,39, 6, 2, 6,23, 5,52, 4,39, 4,50, 4,18, 5,42, 5},
        { 3, 6,26, 6,44, 6,52, 6,38, 6, 1, 6,22, 5,51, 4,39, 4,51, 4,19, 5,43, 5},
        { 4, 6,27, 6,44, 6,52, 6,37, 6, 0, 6,21, 5,50, 4,39, 4,52, 4,20, 5,44, 5},
        { 5, 6,28, 6,45, 6,52, 6,36, 6,58, 5,19, 5,49, 4,39, 4,53, 4,21, 5,45, 5},
        { 5, 6,28, 6,45, 6,52, 6,36, 6,56, 5,18, 5,48, 4,39, 4,54, 4,22, 5,45, 5},
        { 6, 6,29, 6,46, 6,52, 6,35, 6,55, 5,17, 5,47, 4,39, 4,55, 4,23, 5,46, 5},
        { 7, 6,30, 6,47, 6,52, 6,34, 6,53, 5,16, 5,46, 4,39, 4,56, 4,24, 5,47, 5},
        { 7, 6,30, 6,47, 6,51, 6,33, 6,51, 5,15, 5,46, 4,39, 4,57, 4,25, 5,48, 5},
        { 8, 6,31, 6,47, 6,51, 6,32, 6,50, 5,14, 5,45, 4,39, 4,58, 4,26, 5,49, 5},
        { 9, 6,32, 6,48, 6,51, 6,31, 6,48, 5,13, 5,45, 4,40, 4,59, 4,26, 5,50, 5},
        { 9, 6,32, 6,48, 6,50, 6,30, 6,47, 5,12, 5,45, 4,40, 4,59, 4,27, 5,50, 5},
        {10, 6,33, 6,49, 6,50, 6,29, 6,46, 5,11, 5,44, 4,40, 4, 0, 5,28, 5,51, 5},
        {11, 6,34, 6,49, 6,50, 6,28, 6,44, 5,10, 5,44, 4,41, 4, 1, 5,29, 5,52, 5},
        {12, 6,34, 6,50, 6,49, 6,27, 6,43, 5,10, 5,43, 4,41, 4, 2, 5,30, 5,52, 5},
        {13, 6,35, 6,50, 6,49, 6,25, 6,42, 5, 9, 5,43, 4,42, 4, 3, 5,31, 5,53, 5},
        {14, 6,35, 6,51, 6,48, 6,24, 6,41, 5, 8, 5,42, 4,42, 4, 4, 5,32, 5,54, 5},
        {15, 6,36, 6,51, 6,48, 6,22, 6,40, 5, 7, 5,42, 4,42, 4, 5, 5,33, 5,54, 5},
        {16, 6,36, 6,51, 6,47, 6,21, 6,38, 5, 5, 5,41, 4,43, 4, 6, 5,33, 5,55, 5}};
        
        public static void get_line(double [] line14 , int zodiac , int degrees) {
            line14[13] = table_7[degrees][2 * zodiac]; //minuetes
            line14[14] = table_7[degrees][2 * zodiac + 1]; //hours
        }

}

