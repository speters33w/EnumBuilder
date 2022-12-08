package examples;

// The package statement and imports needed to be added to the file.

// All discovery years named "Ancient" in original CSV were removed so field was blank.
// In the Enum, this becomes Year.of(-1)

// findAll ReplaceAll Color.LIGHT_GRAY to Color.LIGHT_GRAY as a default for Erbium and elements over 109.
// findAll ReplaceAll Color.decode(" to Color.decode("# to format the hex values correctly.

import java.awt.Color;
import java.time.Year;

public enum Element { 

    H(1, "H", "Hydrogen", 1.008F, Color.decode("#FFFFFF"), "1s1", 2.2F, 120, 13.598F, 0.754F, "+1, -1", "Gas", 13.81F, 20.28F, 0.00008988, "Nonmetal", Year.of(1766)),
    HE(2, "He", "Helium", 4.0026F, Color.decode("#D9FFFF"), "1s2", -1F, 140, 24.587F, -1F, "0", "Gas", 0.95F, 4.22F, 0.0001785, "Noble gas", Year.of(1868)),
    LI(3, "Li", "Lithium", 7F, Color.decode("#CC80FF"), "[He]2s1", 0.98F, 182, 5.392F, 0.618F, "1", "Solid", 453.65F, 1615F, 0.534, "Alkali metal", Year.of(1817)),
    BE(4, "Be", "Beryllium", 9.012183F, Color.decode("#C2FF00"), "[He]2s2", 1.57F, 153, 9.323F, -1F, "2", "Solid", 1560F, 2744F, 1.85, "Alkaline earth metal", Year.of(1798)),
    B(5, "B", "Boron", 10.81F, Color.decode("#FFB5B5"), "[He]2s2 2p1", 2.04F, 192, 8.298F, 0.277F, "3", "Solid", 2348F, 4273F, 2.37, "Metalloid", Year.of(1808)),
    C(6, "C", "Carbon", 12.011F, Color.decode("#909090"), "[He]2s2 2p2", 2.55F, 170, 11.26F, 1.263F, "+4, +2, -4", "Solid", 3823F, 4098F, 2.267, "Nonmetal", Year.of(-1)),
    N(7, "N", "Nitrogen", 14.007F, Color.decode("#3050F8"), "[He] 2s2 2p3", 3.04F, 155, 14.534F, -1F, "+5, +4, +3, +2, +1, -1, -2, -3", "Gas", 63.15F, 77.36F, 0.0012506, "Nonmetal", Year.of(1772)),
    O(8, "O", "Oxygen", 15.999F, Color.decode("#FF0D0D"), "[He]2s2 2p4", 3.44F, 152, 13.618F, 1.461F, "-2", "Gas", 54.36F, 90.2F, 0.001429, "Nonmetal", Year.of(1774)),
    F(9, "F", "Fluorine", 18.99840316F, Color.decode("#90E050"), "[He]2s2 2p5", 3.98F, 135, 17.423F, 3.339F, "-1", "Gas", 53.53F, 85.03F, 0.001696, "Halogen", Year.of(1670)),
    NE(10, "Ne", "Neon", 20.18F, Color.decode("#B3E3F5"), "[He]2s2 2p6", -1F, 154, 21.565F, -1F, "0", "Gas", 24.56F, 27.07F, 0.0008999, "Noble gas", Year.of(1898)),
    NA(11, "Na", "Sodium", 22.9897693F, Color.decode("#AB5CF2"), "[Ne]3s1", 0.93F, 227, 5.139F, 0.548F, "1", "Solid", 370.95F, 1156F, 0.97, "Alkali metal", Year.of(1807)),
    MG(12, "Mg", "Magnesium", 24.305F, Color.decode("#8AFF00"), "[Ne]3s2", 1.31F, 173, 7.646F, -1F, "2", "Solid", 923F, 1363F, 1.74, "Alkaline earth metal", Year.of(1808)),
    AL(13, "Al", "Aluminum", 26.981538F, Color.decode("#BFA6A6"), "[Ne]3s2 3p1", 1.61F, 184, 5.986F, 0.441F, "3", "Solid", 933.437F, 2792F, 2.7, "Post-transition metal", Year.of(-1)),
    SI(14, "Si", "Silicon", 28.085F, Color.decode("#F0C8A0"), "[Ne]3s2 3p2", 1.9F, 210, 8.152F, 1.385F, "+4, +2, -4", "Solid", 1687F, 3538F, 2.3296, "Metalloid", Year.of(1854)),
    P(15, "P", "Phosphorus", 30.973762F, Color.decode("#FF8000"), "[Ne]3s2 3p3", 2.19F, 180, 10.487F, 0.746F, "+5, +3, -3", "Solid", 317.3F, 553.65F, 1.82, "Nonmetal", Year.of(1669)),
    S(16, "S", "Sulfur", 32.07F, Color.decode("#FFFF30"), "[Ne]3s2 3p4", 2.58F, 180, 10.36F, 2.077F, "+6, +4, -2", "Solid", 388.36F, 717.75F, 2.067, "Nonmetal", Year.of(-1)),
    CL(17, "Cl", "Chlorine", 35.45F, Color.decode("#1FF01F"), "[Ne]3s2 3p5", 3.16F, 175, 12.968F, 3.617F, "+7, +5, +1, -1", "Gas", 171.65F, 239.11F, 0.003214, "Halogen", Year.of(1774)),
    AR(18, "Ar", "Argon", 39.9F, Color.decode("#80D1E3"), "[Ne]3s2 3p6", -1F, 188, 15.76F, -1F, "0", "Gas", 83.8F, 87.3F, 0.0017837, "Noble gas", Year.of(1894)),
    K(19, "K", "Potassium", 39.0983F, Color.decode("#8F40D4"), "[Ar]4s1", 0.82F, 275, 4.341F, 0.501F, "1", "Solid", 336.53F, 1032F, 0.89, "Alkali metal", Year.of(1807)),
    CA(20, "Ca", "Calcium", 40.08F, Color.decode("#3DFF00"), "[Ar]4s2", 1F, 231, 6.113F, -1F, "2", "Solid", 1115F, 1757F, 1.54, "Alkaline earth metal", Year.of(-1)),
    SC(21, "Sc", "Scandium", 44.95591F, Color.decode("#E6E6E6"), "[Ar]4s2 3d1", 1.36F, 211, 6.561F, 0.188F, "3", "Solid", 1814F, 3109F, 2.99, "Transition metal", Year.of(1879)),
    TI(22, "Ti", "Titanium", 47.867F, Color.decode("#BFC2C7"), "[Ar]4s2 3d2", 1.54F, 187, 6.828F, 0.079F, "+4, +3, +2", "Solid", 1941F, 3560F, 4.5, "Transition metal", Year.of(1791)),
    V(23, "V", "Vanadium", 50.9415F, Color.decode("#A6A6AB"), "[Ar]4s2 3d3", 1.63F, 179, 6.746F, 0.525F, "+5, +4, +3, +2", "Solid", 2183F, 3680F, 6, "Transition metal", Year.of(1801)),
    CR(24, "Cr", "Chromium", 51.996F, Color.decode("#8A99C7"), "[Ar]3d5 4s1", 1.66F, 189, 6.767F, 0.666F, "+6, +3, +2", "Solid", 2180F, 2944F, 7.15, "Transition metal", Year.of(1797)),
    MN(25, "Mn", "Manganese", 54.93804F, Color.decode("#9C7AC7"), "[Ar]4s2 3d5", 1.55F, 197, 7.434F, -1F, "+7, +4, +3, +2", "Solid", 1519F, 2334F, 7.3, "Transition metal", Year.of(1774)),
    FE(26, "Fe", "Iron", 55.84F, Color.decode("#E06633"), "[Ar]4s2 3d6", 1.83F, 194, 7.902F, 0.163F, "+3, +2", "Solid", 1811F, 3134F, 7.874, "Transition metal", Year.of(-1)),
    CO(27, "Co", "Cobalt", 58.93319F, Color.decode("#F090A0"), "[Ar]4s2 3d7", 1.88F, 192, 7.881F, 0.661F, "+3, +2", "Solid", 1768F, 3200F, 8.86, "Transition metal", Year.of(1735)),
    NI(28, "Ni", "Nickel", 58.693F, Color.decode("#50D050"), "[Ar]4s2 3d8", 1.91F, 163, 7.64F, 1.156F, "+3, +2", "Solid", 1728F, 3186F, 8.912, "Transition metal", Year.of(1751)),
    CU(29, "Cu", "Copper", 63.55F, Color.decode("#C88033"), "[Ar]4s1 3d10", 1.9F, 140, 7.726F, 1.228F, "+2, +1", "Solid", 1357.77F, 2835F, 8.933, "Transition metal", Year.of(-1)),
    ZN(30, "Zn", "Zinc", 65.4F, Color.decode("#7D80B0"), "[Ar]4s2 3d10", 1.65F, 139, 9.394F, -1F, "2", "Solid", 692.68F, 1180F, 7.134, "Transition metal", Year.of(1746)),
    GA(31, "Ga", "Gallium", 69.723F, Color.decode("#C28F8F"), "[Ar]4s2 3d10 4p1", 1.81F, 187, 5.999F, 0.3F, "3", "Solid", 302.91F, 2477F, 5.91, "Post-transition metal", Year.of(1875)),
    GE(32, "Ge", "Germanium", 72.63F, Color.decode("#668F8F"), "[Ar]4s2 3d10 4p2", 2.01F, 211, 7.9F, 1.35F, "+4, +2", "Solid", 1211.4F, 3106F, 5.323, "Metalloid", Year.of(1886)),
    AS(33, "As", "Arsenic", 74.92159F, Color.decode("#BD80E3"), "[Ar]4s2 3d10 4p3", 2.18F, 185, 9.815F, 0.81F, "+5, +3, -3", "Solid", 1090F, 887F, 5.776, "Metalloid", Year.of(-1)),
    SE(34, "Se", "Selenium", 78.97F, Color.decode("#FFA100"), "[Ar]4s2 3d10 4p4", 2.55F, 190, 9.752F, 2.021F, "+6, +4, -2", "Solid", 493.65F, 958F, 4.809, "Nonmetal", Year.of(1817)),
    BR(35, "Br", "Bromine", 79.9F, Color.decode("#A62929"), "[Ar]4s2 3d10 4p5", 2.96F, 183, 11.814F, 3.365F, "+5, +1, -1", "Liquid", 265.95F, 331.95F, 3.11, "Halogen", Year.of(1826)),
    KR(36, "Kr", "Krypton", 83.8F, Color.decode("#5CB8D1"), "[Ar]4s2 3d10 4p6", 3F, 202, 14F, -1F, "0", "Gas", 115.79F, 119.93F, 0.003733, "Noble gas", Year.of(1898)),
    RB(37, "Rb", "Rubidium", 85.468F, Color.decode("#702EB0"), "[Kr]5s1", 0.82F, 303, 4.177F, 0.468F, "1", "Solid", 312.46F, 961F, 1.53, "Alkali metal", Year.of(1861)),
    SR(38, "Sr", "Strontium", 87.62F, Color.decode("#00FF00"), "[Kr]5s2", 0.95F, 249, 5.695F, -1F, "2", "Solid", 1050F, 1655F, 2.64, "Alkaline earth metal", Year.of(1790)),
    Y(39, "Y", "Yttrium", 88.90584F, Color.decode("#94FFFF"), "[Kr]5s2 4d1", 1.22F, 219, 6.217F, 0.307F, "3", "Solid", 1795F, 3618F, 4.47, "Transition metal", Year.of(1794)),
    ZR(40, "Zr", "Zirconium", 91.22F, Color.decode("#94E0E0"), "[Kr]5s2 4d2", 1.33F, 186, 6.634F, 0.426F, "4", "Solid", 2128F, 4682F, 6.52, "Transition metal", Year.of(1789)),
    NB(41, "Nb", "Niobium", 92.90637F, Color.decode("#73C2C9"), "[Kr]5s1 4d4", 1.6F, 207, 6.759F, 0.893F, "+5, +3", "Solid", 2750F, 5017F, 8.57, "Transition metal", Year.of(1801)),
    MO(42, "Mo", "Molybdenum", 95.95F, Color.decode("#54B5B5"), "[Kr]5s1 4d5", 2.16F, 209, 7.092F, 0.746F, "6", "Solid", 2896F, 4912F, 10.2, "Transition metal", Year.of(1778)),
    TC(43, "Tc", "Technetium", 96.90636F, Color.decode("#3B9E9E"), "[Kr]5s2 4d5", 1.9F, 209, 7.28F, 0.55F, "+7, +6, +4", "Solid", 2430F, 4538F, 11, "Transition metal", Year.of(1937)),
    RU(44, "Ru", "Ruthenium", 101.1F, Color.decode("#248F8F"), "[Kr]5s1 4d7", 2.2F, 207, 7.361F, 1.05F, "3", "Solid", 2607F, 4423F, 12.1, "Transition metal", Year.of(1827)),
    RH(45, "Rh", "Rhodium", 102.9055F, Color.decode("#0A7D8C"), "[Kr]5s1 4d8", 2.28F, 195, 7.459F, 1.137F, "3", "Solid", 2237F, 3968F, 12.4, "Transition metal", Year.of(1803)),
    PD(46, "Pd", "Palladium", 106.42F, Color.decode("#6985"), "[Kr]4d10", 2.2F, 202, 8.337F, 0.557F, "+3, +2", "Solid", 1828.05F, 3236F, 12, "Transition metal", Year.of(1803)),
    AG(47, "Ag", "Silver", 107.868F, Color.decode("#C0C0C0"), "[Kr]5s1 4d10", 1.93F, 172, 7.576F, 1.302F, "1", "Solid", 1234.93F, 2435F, 10.501, "Transition metal", Year.of(-1)),
    CD(48, "Cd", "Cadmium", 112.41F, Color.decode("#FFD98F"), "[Kr]5s2 4d10", 1.69F, 158, 8.994F, -1F, "2", "Solid", 594.22F, 1040F, 8.69, "Transition metal", Year.of(1817)),
    IN(49, "In", "Indium", 114.818F, Color.decode("#A67573"), "[Kr]5s2 4d10 5p1", 1.78F, 193, 5.786F, 0.3F, "3", "Solid", 429.75F, 2345F, 7.31, "Post-transition metal", Year.of(1863)),
    SN(50, "Sn", "Tin", 118.71F, Color.decode("#668080"), "[Kr]5s2 4d10 5p2", 1.96F, 217, 7.344F, 1.2F, "+4, +2", "Solid", 505.08F, 2875F, 7.287, "Post-transition metal", Year.of(-1)),
    SB(51, "Sb", "Antimony", 121.76F, Color.decode("#9E63B5"), "[Kr]5s2 4d10 5p3", 2.05F, 206, 8.64F, 1.07F, "+5, +3, -3", "Solid", 903.78F, 1860F, 6.685, "Metalloid", Year.of(-1)),
    TE(52, "Te", "Tellurium", 127.6F, Color.decode("#D47A00"), "[Kr]5s2 4d10 5p4", 2.1F, 206, 9.01F, 1.971F, "+6, +4, -2", "Solid", 722.66F, 1261F, 6.232, "Metalloid", Year.of(1782)),
    I(53, "I", "Iodine", 126.9045F, Color.decode("#940094"), "[Kr]5s2 4d10 5p5", 2.66F, 198, 10.451F, 3.059F, "+7, +5, +1, -1", "Solid", 386.85F, 457.55F, 4.93, "Halogen", Year.of(1811)),
    XE(54, "Xe", "Xenon", 131.29F, Color.decode("#429EB0"), "[Kr]5s2 4d10 5p6", 2.6F, 216, 12.13F, -1F, "0", "Gas", 161.36F, 165.03F, 0.005887, "Noble gas", Year.of(1898)),
    CS(55, "Cs", "Cesium", 132.905452F, Color.decode("#57178F"), "[Xe]6s1", 0.79F, 343, 3.894F, 0.472F, "1", "Solid", 301.59F, 944F, 1.93, "Alkali metal", Year.of(1860)),
    BA(56, "Ba", "Barium", 137.33F, Color.decode("#00C900"), "[Xe]6s2", 0.89F, 268, 5.212F, -1F, "2", "Solid", 1000F, 2170F, 3.62, "Alkaline earth metal", Year.of(1808)),
    LA(57, "La", "Lanthanum", 138.9055F, Color.decode("#70D4FF"), "[Xe]6s2 5d1", 1.1F, 240, 5.577F, 0.5F, "3", "Solid", 1191F, 3737F, 6.15, "Lanthanide", Year.of(1839)),
    CE(58, "Ce", "Cerium", 140.116F, Color.decode("#FFFFC7"), "[Xe]6s2 4f1 5d1", 1.12F, 235, 5.539F, 0.5F, "+4, +3", "Solid", 1071F, 3697F, 6.77, "Lanthanide", Year.of(1803)),
    PR(59, "Pr", "Praseodymium", 140.90766F, Color.decode("#D9FFC7"), "[Xe]6s2 4f3", 1.13F, 239, 5.464F, -1F, "3", "Solid", 1204F, 3793F, 6.77, "Lanthanide", Year.of(1885)),
    ND(60, "Nd", "Neodymium", 144.24F, Color.decode("#C7FFC7"), "[Xe]6s2 4f4", 1.14F, 229, 5.525F, -1F, "3", "Solid", 1294F, 3347F, 7.01, "Lanthanide", Year.of(1885)),
    PM(61, "Pm", "Promethium", 144.91276F, Color.decode("#A3FFC7"), "[Xe]6s2 4f5", -1F, 236, 5.55F, -1F, "3", "Solid", 1315F, 3273F, 7.26, "Lanthanide", Year.of(1945)),
    SM(62, "Sm", "Samarium", 150.4F, Color.decode("#8FFFC7"), "[Xe]6s2 4f6", 1.17F, 229, 5.644F, -1F, "+3, +2", "Solid", 1347F, 2067F, 7.52, "Lanthanide", Year.of(1879)),
    EU(63, "Eu", "Europium", 151.964F, Color.decode("#61FFC7"), "[Xe]6s2 4f7", -1F, 233, 5.67F, -1F, "+3, +2", "Solid", 1095F, 1802F, 5.24, "Lanthanide", Year.of(1901)),
    GD(64, "Gd", "Gadolinium", 157.2F, Color.decode("#45FFC7"), "[Xe]6s2 4f7 5d1", 1.2F, 237, 6.15F, -1F, "3", "Solid", 1586F, 3546F, 7.9, "Lanthanide", Year.of(1880)),
    TB(65, "Tb", "Terbium", 158.92535F, Color.decode("#30FFC7"), "[Xe]6s2 4f9", -1F, 221, 5.864F, -1F, "3", "Solid", 1629F, 3503F, 8.23, "Lanthanide", Year.of(1843)),
    DY(66, "Dy", "Dysprosium", 162.5F, Color.decode("#1FFFC7"), "[Xe]6s2 4f10", 1.22F, 229, 5.939F, -1F, "3", "Solid", 1685F, 2840F, 8.55, "Lanthanide", Year.of(1886)),
    HO(67, "Ho", "Holmium", 164.93033F, Color.decode("#00FF9C"), "[Xe]6s2 4f11", 1.23F, 216, 6.022F, -1F, "3", "Solid", 1747F, 2973F, 8.8, "Lanthanide", Year.of(1878)),
    ER(68, "Er", "Erbium", 167.26F, Color.LIGHT_GRAY, "[Xe]6s2 4f12", 1.24F, 235, 6.108F, -1F, "3", "Solid", 1802F, 3141F, 9.07, "Lanthanide", Year.of(1843)),
    TM(69, "Tm", "Thulium", 168.93422F, Color.decode("#00D452"), "[Xe]6s2 4f13", 1.25F, 227, 6.184F, -1F, "3", "Solid", 1818F, 2223F, 9.32, "Lanthanide", Year.of(1879)),
    YB(70, "Yb", "Ytterbium", 173.05F, Color.decode("#00BF38"), "[Xe]6s2 4f14", -1F, 242, 6.254F, -1F, "+3, +2", "Solid", 1092F, 1469F, 6.9, "Lanthanide", Year.of(1878)),
    LU(71, "Lu", "Lutetium", 174.9668F, Color.decode("#00AB24"), "[Xe]6s2 4f14 5d1", 1.27F, 221, 5.426F, -1F, "3", "Solid", 1936F, 3675F, 9.84, "Lanthanide", Year.of(1907)),
    HF(72, "Hf", "Hafnium", 178.49F, Color.decode("#4DC2FF"), "[Xe]6s2 4f14 5d2", 1.3F, 212, 6.825F, -1F, "4", "Solid", 2506F, 4876F, 13.3, "Transition metal", Year.of(1923)),
    TA(73, "Ta", "Tantalum", 180.9479F, Color.decode("#4DA6FF"), "[Xe]6s2 4f14 5d3", 1.5F, 217, 7.89F, 0.322F, "5", "Solid", 3290F, 5731F, 16.4, "Transition metal", Year.of(1802)),
    W(74, "W", "Tungsten", 183.84F, Color.decode("#2194D6"), "[Xe]6s2 4f14 5d4", 2.36F, 210, 7.98F, 0.815F, "6", "Solid", 3695F, 5828F, 19.3, "Transition metal", Year.of(1783)),
    RE(75, "Re", "Rhenium", 186.207F, Color.decode("#267DAB"), "[Xe]6s2 4f14 5d5", 1.9F, 217, 7.88F, 0.15F, "+7, +6, +4", "Solid", 3459F, 5869F, 20.8, "Transition metal", Year.of(1925)),
    OS(76, "Os", "Osmium", 190.2F, Color.decode("#266696"), "[Xe]6s2 4f14 5d6", 2.2F, 216, 8.7F, 1.1F, "+4, +3", "Solid", 3306F, 5285F, 22.57, "Transition metal", Year.of(1803)),
    IR(77, "Ir", "Iridium", 192.22F, Color.decode("#175487"), "[Xe]6s2 4f14 5d7", 2.2F, 202, 9.1F, 1.565F, "+4, +3", "Solid", 2719F, 4701F, 22.42, "Transition metal", Year.of(1803)),
    PT(78, "Pt", "Platinum", 195.08F, Color.decode("#D0D0E0"), "[Xe]6s1 4f14 5d9", 2.28F, 209, 9F, 2.128F, "+4, +2", "Solid", 2041.55F, 4098F, 21.46, "Transition metal", Year.of(1735)),
    AU(79, "Au", "Gold", 196.96657F, Color.decode("#FFD123"), "[Xe]6s1 4f14 5d10", 2.54F, 166, 9.226F, 2.309F, "+3, +1", "Solid", 1337.33F, 3129F, 19.282, "Transition metal", Year.of(-1)),
    HG(80, "Hg", "Mercury", 200.59F, Color.decode("#B8B8D0"), "[Xe]6s2 4f14 5d10", 2F, 209, 10.438F, -1F, "+2, +1", "Liquid", 234.32F, 629.88F, 13.5336, "Transition metal", Year.of(-1)),
    TL(81, "Tl", "Thallium", 204.383F, Color.decode("#A6544D"), "[Xe]6s2 4f14 5d10 6p1", 1.62F, 196, 6.108F, 0.2F, "+3, +1", "Solid", 577F, 1746F, 11.8, "Post-transition metal", Year.of(1861)),
    PB(82, "Pb", "Lead", 207F, Color.decode("#575961"), "[Xe]6s2 4f14 5d10 6p2", 2.33F, 202, 7.417F, 0.36F, "+4, +2", "Solid", 600.61F, 2022F, 11.342, "Post-transition metal", Year.of(-1)),
    BI(83, "Bi", "Bismuth", 208.9804F, Color.decode("#9E4FB5"), "[Xe]6s2 4f14 5d10 6p3", 2.02F, 207, 7.289F, 0.946F, "+5, +3", "Solid", 544.55F, 1837F, 9.807, "Post-transition metal", Year.of(1753)),
    PO(84, "Po", "Polonium", 208.98243F, Color.decode("#AB5C00"), "[Xe]6s2 4f14 5d10 6p4", 2F, 197, 8.417F, 1.9F, "+4, +2", "Solid", 527F, 1235F, 9.32, "Metalloid", Year.of(1898)),
    AT(85, "At", "Astatine", 209.98715F, Color.decode("#754F45"), "[Xe]6s2 4f14 5d10 6p5", 2.2F, 202, 9.5F, 2.8F, "7, 5, 3, 1, -1", "Solid", 575F, -1F, 7, "Halogen", Year.of(1940)),
    RN(86, "Rn", "Radon", 222.01758F, Color.decode("#428296"), "[Xe]6s2 4f14 5d10 6p6", -1F, 220, 10.745F, -1F, "0", "Gas", 202F, 211.45F, 0.00973, "Noble gas", Year.of(1900)),
    FR(87, "Fr", "Francium", 223.01973F, Color.decode("#420066"), "[Rn]7s1", 0.7F, 348, 3.9F, 0.47F, "1", "Solid", 300F, -1F, -1, "Alkali metal", Year.of(1939)),
    RA(88, "Ra", "Radium", 226.02541F, Color.decode("#007D00"), "[Rn]7s2", 0.9F, 283, 5.279F, -1F, "2", "Solid", 973F, 1413F, 5, "Alkaline earth metal", Year.of(1898)),
    AC(89, "Ac", "Actinium", 227.02775F, Color.decode("#70ABFA"), "[Rn]7s2 6d1", 1.1F, 260, 5.17F, -1F, "3", "Solid", 1324F, 3471F, 10.07, "Actinide", Year.of(1899)),
    TH(90, "Th", "Thorium", 232.038F, Color.decode("#00BAFF"), "[Rn]7s2 6d2", 1.3F, 237, 6.08F, -1F, "4", "Solid", 2023F, 5061F, 11.72, "Actinide", Year.of(1828)),
    PA(91, "Pa", "Protactinium", 231.03588F, Color.decode("#00A1FF"), "[Rn]7s2 5f2 6d1", 1.5F, 243, 5.89F, -1F, "+5, +4", "Solid", 1845F, -1F, 15.37, "Actinide", Year.of(1913)),
    U(92, "U", "Uranium", 238.0289F, Color.decode("#008FFF"), "[Rn]7s2 5f3 6d1", 1.38F, 240, 6.194F, -1F, "+6, +5, +4, +3", "Solid", 1408F, 4404F, 18.95, "Actinide", Year.of(1789)),
    NP(93, "Np", "Neptunium", 237.048172F, Color.decode("#0080FF"), "[Rn]7s2 5f4 6d1", 1.36F, 221, 6.266F, -1F, "+6, +5, +4, +3", "Solid", 917F, 4175F, 20.25, "Actinide", Year.of(1940)),
    PU(94, "Pu", "Plutonium", 244.0642F, Color.decode("#006BFF"), "[Rn]7s2 5f6", 1.28F, 243, 6.06F, -1F, "+6, +5, +4, +3", "Solid", 913F, 3501F, 19.84, "Actinide", Year.of(1940)),
    AM(95, "Am", "Americium", 243.06138F, Color.decode("#545CF2"), "[Rn]7s2 5f7", 1.3F, 244, 5.993F, -1F, "+6, +5, +4, +3", "Solid", 1449F, 2284F, 13.69, "Actinide", Year.of(1944)),
    CM(96, "Cm", "Curium", 247.07035F, Color.decode("#785CE3"), "[Rn]7s2 5f7 6d1", 1.3F, 245, 6.02F, -1F, "3", "Solid", 1618F, 3400F, 13.51, "Actinide", Year.of(1944)),
    BK(97, "Bk", "Berkelium", 247.07031F, Color.decode("#8A4FE3"), "[Rn]7s2 5f9", 1.3F, 244, 6.23F, -1F, "+4, +3", "Solid", 1323F, -1F, 14, "Actinide", Year.of(1949)),
    CF(98, "Cf", "Californium", 251.07959F, Color.decode("#A136D4"), "[Rn]7s2 5f10", 1.3F, 245, 6.3F, -1F, "3", "Solid", 1173F, -1F, -1, "Actinide", Year.of(1950)),
    ES(99, "Es", "Einsteinium", 252.083F, Color.decode("#B31FD4"), "[Rn]7s2 5f11", 1.3F, 245, 6.42F, -1F, "3", "Solid", 1133F, -1F, -1, "Actinide", Year.of(1952)),
    FM(100, "Fm", "Fermium", 257.09511F, Color.decode("#B31FBA"), "[Rn] 5f12 7s2", 1.3F, -1, 6.5F, -1F, "3", "Solid", 1800F, -1F, -1, "Actinide", Year.of(1952)),
    MD(101, "Md", "Mendelevium", 258.09843F, Color.decode("#B30DA6"), "[Rn]7s2 5f13", 1.3F, -1, 6.58F, -1F, "+3, +2", "Solid", 1100F, -1F, -1, "Actinide", Year.of(1955)),
    NO(102, "No", "Nobelium", 259.101F, Color.decode("#BD0D87"), "[Rn]7s2 5f14", 1.3F, -1, 6.65F, -1F, "+3, +2", "Solid", 1100F, -1F, -1, "Actinide", Year.of(1957)),
    LR(103, "Lr", "Lawrencium", 266.12F, Color.decode("#C70066"), "[Rn]7s2 5f14 6d1", 1.3F, -1, -1F, -1F, "3", "Solid", 1900F, -1F, -1, "Actinide", Year.of(1961)),
    RF(104, "Rf", "Rutherfordium", 267.122F, Color.decode("#CC0059"), "[Rn]7s2 5f14 6d2", -1F, -1, -1F, -1F, "4", "Solid", -1F, -1F, -1, "Transition metal", Year.of(1964)),
    DB(105, "Db", "Dubnium", 268.126F, Color.decode("#D1004F"), "[Rn]7s2 5f14 6d3", -1F, -1, -1F, -1F, "5, 4, 3", "Solid", -1F, -1F, -1, "Transition metal", Year.of(1967)),
    SG(106, "Sg", "Seaborgium", 269.128F, Color.decode("#D90045"), "[Rn]7s2 5f14 6d4", -1F, -1, -1F, -1F, "6, 5, 4, 3, 0", "Solid", -1F, -1F, -1, "Transition metal", Year.of(1974)),
    BH(107, "Bh", "Bohrium", 270.133F, Color.decode("#E00038"), "[Rn]7s2 5f14 6d5", -1F, -1, -1F, -1F, "7, 5, 4, 3", "Solid", -1F, -1F, -1, "Transition metal", Year.of(1976)),
    HS(108, "Hs", "Hassium", 269.1336F, Color.decode("#E6002E"), "[Rn]7s2 5f14 6d6", -1F, -1, -1F, -1F, "8, 6, 5, 4, 3, 2", "Solid", -1F, -1F, -1, "Transition metal", Year.of(1984)),
    MT(109, "Mt", "Meitnerium", 277.154F, Color.decode("#EB0026"), "[Rn]7s2 5f14 6d7 (calculated)", -1F, -1, -1F, -1F, "9, 8, 6, 4, 3, 1", "Solid", -1F, -1F, -1, "Transition metal", Year.of(1982)),
    DS(110, "Ds", "Darmstadtium", 282.166F, Color.LIGHT_GRAY, "[Rn]7s2 5f14 6d8 (predicted)", -1F, -1, -1F, -1F, "8, 6, 4, 2, 0", "Expected to be a Solid", -1F, -1F, -1, "Transition metal", Year.of(1994)),
    RG(111, "Rg", "Roentgenium", 282.169F, Color.LIGHT_GRAY, "[Rn]7s2 5f14 6d9 (predicted)", -1F, -1, -1F, -1F, "5, 3, 1, -1", "Expected to be a Solid", -1F, -1F, -1, "Transition metal", Year.of(1994)),
    CN(112, "Cn", "Copernicium", 286.179F, Color.LIGHT_GRAY, "[Rn]7s2 5f14 6d10 (predicted)", -1F, -1, -1F, -1F, "2, 1, 0", "Expected to be a Solid", -1F, -1F, -1, "Transition metal", Year.of(1996)),
    NH(113, "Nh", "Nihonium", 286.182F, Color.LIGHT_GRAY, "[Rn]5f14 6d10 7s2 7p1 (predicted)", -1F, -1, -1F, -1F, "", "Expected to be a Solid", -1F, -1F, -1, "Post-transition metal", Year.of(2004)),
    FL(114, "Fl", "Flerovium", 290.192F, Color.LIGHT_GRAY, "[Rn]7s2 7p2 5f14 6d10 (predicted)", -1F, -1, -1F, -1F, "6, 4,2, 1, 0", "Expected to be a Solid", -1F, -1F, -1, "Post-transition metal", Year.of(1998)),
    MC(115, "Mc", "Moscovium", 290.196F, Color.LIGHT_GRAY, "[Rn]7s2 7p3 5f14 6d10 (predicted)", -1F, -1, -1F, -1F, "3, 1", "Expected to be a Solid", -1F, -1F, -1, "Post-transition metal", Year.of(2003)),
    LV(116, "Lv", "Livermorium", 293.205F, Color.LIGHT_GRAY, "[Rn]7s2 7p4 5f14 6d10 (predicted)", -1F, -1, -1F, -1F, "+4, +2, -2", "Expected to be a Solid", -1F, -1F, -1, "Post-transition metal", Year.of(2000)),
    TS(117, "Ts", "Tennessine", 294.211F, Color.LIGHT_GRAY, "[Rn]7s2 7p5 5f14 6d10 (predicted)", -1F, -1, -1F, -1F, "+5, +3, +1, -1", "Expected to be a Solid", -1F, -1F, -1, "Halogen", Year.of(2010)),
    OG(118, "Og", "Oganesson", 295.216F, Color.LIGHT_GRAY, "[Rn]7s2 7p6 5f14 6d10 (predicted)", -1F, -1, -1F, -1F, "+6, +4, +2, +1, 0, -1", "Expected to be a Gas", -1F, -1F, -1, "Noble gas", Year.of(2006));

    private final int atomicNumber;
    private final String symbol;
    private final String name;
    private final float atomicMass;
    private final Color cpkHexColor;
    private final String electronConfiguration;
    private final float electronegativity;
    private final int atomicRadius;
    private final float ionizationEnergy;
    private final float electronAffinity;
    private final String oxidationStates;
    private final String standardState;
    private final float meltingPoint;
    private final float boilingPoint;
    private final double density;
    private final String groupBlock;
    private final Year yearDiscovered;

    Element(int atomicNumber, String symbol, String name, float atomicMass, Color cpkHexColor, String electronConfiguration, float electronegativity, int atomicRadius, float ionizationEnergy, float electronAffinity, String oxidationStates, String standardState, float meltingPoint, float boilingPoint, double density, String groupBlock, Year yearDiscovered) {
        this.atomicNumber = atomicNumber;
        this.symbol = symbol;
        this.name = name;
        this.atomicMass = atomicMass;
        this.cpkHexColor = cpkHexColor;
        this.electronConfiguration = electronConfiguration;
        this.electronegativity = electronegativity;
        this.atomicRadius = atomicRadius;
        this.ionizationEnergy = ionizationEnergy;
        this.electronAffinity = electronAffinity;
        this.oxidationStates = oxidationStates;
        this.standardState = standardState;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
        this.density = density;
        this.groupBlock = groupBlock;
        this.yearDiscovered = yearDiscovered;
    }

    public int getAtomicNumber() {
        return this.atomicNumber;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }

    public float getAtomicMass() {
        return this.atomicMass;
    }

    public Color getCpkHexColor() {
        return this.cpkHexColor;
    }

    public String getElectronConfiguration() {
        return this.electronConfiguration;
    }

    public float getElectronegativity() {
        return this.electronegativity;
    }

    public int getAtomicRadius() {
        return this.atomicRadius;
    }

    public float getIonizationEnergy() {
        return this.ionizationEnergy;
    }

    public float getElectronAffinity() {
        return this.electronAffinity;
    }

    public String getOxidationStates() {
        return this.oxidationStates;
    }

    public String getStandardState() {
        return this.standardState;
    }

    public float getMeltingPoint() {
        return this.meltingPoint;
    }

    public float getBoilingPoint() {
        return this.boilingPoint;
    }

    public double getDensity() {
        return this.density;
    }

    public String getGroupBlock() {
        return this.groupBlock;
    }

    public Year getYearDiscovered() {
        return this.yearDiscovered;
    }

}
