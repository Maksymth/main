package app.var;

// Code
public class Parameter {
    // * Basic
    public class basic {
        // Extra parameters
        public class extra {
            public static int SPACE_UP;
            public static int SPACE_BOTTOM;
            public static int SPACE_LEFT;
            public static int SPACE_RIGHT;
        }

        // Figure parameters
        public class figure {
            public static int ROW_AMOUNT;
            public static int SYMBOL_SPACE_AMOUNT;
            public static int END_SYMBOL_FIGURE_AMOUNT;
        }

        // Symbol parameters
        public class symbol {
            public static String FIGURE_SYMBOL;
            public static String SPACE_SYMBOL;
        }

        // Check-structure`s parameters
        public class check {
            // Is equal?
            public class isEqual {
                public static String SPACE_VERTICAL_AND_HORIZONTAL;
                public static String SPACE_VERTICAL;
                public static String SPACE_HORIZONTAL;
            }

            // Equal number
            public class equalNumber {
                public static int SPACE_VERTICAL_AND_HORIZONTAL;
                public static int SPACE_VERTICAL;
                public static int SPACE_HORIZONTAL;
            }
        }
    }

    // * Descriptions
    public class descripction {
        // Extra`s descriptions
        public class extra {
            public static String SPACE_UP = "extra space up, numeric value";
            public static String SPACE_BOTTOM = "extra space bottom, numeric value";
            public static String SPACE_LEFT = "extra space left, numeric value";
            public static String SPACE_RIGHT = "extra space right, numeric value";
        }

        // Figure`s descriptions
        public class figure {
            public static String ROW_AMOUNT = "total row amount, - numeric value";
            public static String SYMBOL_SPACE_AMOUNT = "amount of cycled space symbol for every skip, - numeric value (if value is even - amount of figure symbol at the end of the figure will be 2 symbols, anyway)";
            public static String END_SYMBOL_FIGURE_AMOUNT = "amount of figure symbol at the end of figure, - numeric value (please, enter only one number: \"1\" or \"2\")";
        }

        // Symbol`s descriptions
        public class symbol {
            public static String FIGURE_SYMBOL = "figure symbol (please, enter only 1 symbol)";
            public static String SPACE_SYMBOL = "space symbol (please, enter only 1 symbol)";
        }

        // Check-structure`s descriptions
        public class check {
            // Is equal?
            public class isEqual {
                public static String SPACE_VERTICAL_AND_HORIZONTAL = "is extra spaces: up/bottom and left/right, - will be the same? (please, enter only: \"y/n\" or \"yes/no\", - letter case doesn't metter)";
                public static String SPACE_VERTICAL = "is extra spaces: up/bottom, - will be the same? (please, enter only: \"y/n\" or \"yes/no\", - letter case doesn't metter)";
                public static String SPACE_HORIZONTAL = "is extra spaces: left/right, - will be the same? (please, enter only: \"y/n\" or \"yes/no\", - letter case doesn't metter)";
            }

            // Equal number
            public class equalNumber {
                public static String SPACE_VERTICAL_AND_HORIZONTAL = "extra space: up/bottom and left/right, - numberic value";
                public static String SPACE_VERTICAL = "extra space: up/bottom, - numberic value";
                public static String SPACE_HORIZONTAL = "extra space: left/right, - numberic value";
            }
        }
    }
}