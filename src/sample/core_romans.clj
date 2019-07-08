(ns sample.core
  (:gen-class))

(import com.github.fracpete.romannumerals4j.RomanNumeralFormat)

(defn your-age-in-romans
  "return age in roman numeral notation"
  [age]
  (let [formatter (RomanNumeralFormat.)]
    (. formatter format age)))

