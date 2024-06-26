import 'package:dio/dio.dart';
import 'package:example_flutter_dart/place_model.dart';

class PlaceService {
  final String baseUrl = "http://localhost:8000/api/v1/place"; // Replace with your API endpoint
  final dio = Dio();

  Future<List<PlaceModel>> fetchPlaces() async {
    try {
      final response = await dio.get(baseUrl);

      if (response.statusCode == 200) {
        List<dynamic> jsonList = response.data;
        return jsonList.map((json) => PlaceModel.fromJson(json)).toList();
      } else {
        throw Exception('Failed to load places');
      }
    } catch (e) {
      throw Exception('Failed to load places: $e');
    }
  }
}