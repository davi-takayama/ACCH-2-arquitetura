class CalculaMilhas:
    def calculate_distance_in_miles(start_point, end_point):
        return start_point - end_point

class ConversorQuilometros:
    def convert_miles_to_kilometers(miles):
        miles_in_kilometers = miles * 1.60934
        return miles_in_kilometers

class MilhasParaQuilometrosAdapter(ConversorQuilometros):
    def __init__(self, miles_calculator):
        self.miles_calculator = miles_calculator
        

    def convert_miles_to_kilometers(self, miles):
        start_point = 0
        end_point = miles
        distance_in_miles = self.miles_calculator.calculate_distance_in_miles(start_point, end_point)
        distance_in_kilometers = super().convert_miles_to_kilometers(distance_in_miles)
        return distance_in_kilometers

if __name__ == "__main__":
    miles_calculator = CalculaMilhas()
    adapter = MilhasParaQuilometrosAdapter(miles_calculator)

    miles_distance = 50
    kilometers_distance = adapter.convert_miles_to_kilometers(miles_distance)

    print(f"{miles_distance} milhas equivalem a {kilometers_distance:.2f} quilômetros.")
