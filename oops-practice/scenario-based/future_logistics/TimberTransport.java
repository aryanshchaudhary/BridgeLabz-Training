package future_logistics;

public class TimberTransport extends GoodsTransport {
	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice;
	
	public TimberTransport(String transportId, String transportDate, int transportRating,
			float timberLength, float timberRadius, String timberType, float timberPrice) {
		super(transportId, transportDate, transportRating);
		this.timberLength = timberLength;
		this.timberRadius = timberRadius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;
	}
	
	public float getTimberLength() {
		return timberLength;
	}
	public float getTimberRadius() {
		return timberRadius;
	}
	public String getTimberType() {
		return timberType;
	}
	public float getTimberPrice() {
		return timberPrice;
	}
	
	public void setTimberLength(float length) {
		timberLength = length;
	}
	public void setTimberRadius(float radius) {
		timberRadius = radius;
	}
	public void setTimberType(String type) {
		timberType = type;
	}
	public void setTimberPrice(float price) {
		timberPrice = price;
	}
	
	@Override
	public String vehicleSelection() {
		float area = (float) (2 * 3.147 * timberRadius * timberLength);
		if(area < 250) {
			return "Truck";
		}else if(area >= 250 && area <= 400) {
			return "Lorry";
		}else {
			return "MonsterLorry";
		}
	}
	
	@Override
    public float calculateTotalCharge() {

        float volume = 3.147f * timberRadius * timberRadius * timberLength;

        float rate;
        if (timberType.equalsIgnoreCase("Premium")) {
            rate = 0.25f;
        } else {
            rate = 0.15f;
        }

        float price = volume * timberPrice * rate;
        float tax = price * 0.30f;

        float discount = 0;
        if (transportRating == 5) {
            discount = price * 0.20f;
        } else if (transportRating == 3 || transportRating == 4) {
            discount = price * 0.10f;
        }

        float vehiclePrice = 0;
        String vehicle = vehicleSelection();

        if (vehicle.equalsIgnoreCase("Truck")) {
            vehiclePrice = 1000;
        } else if (vehicle.equalsIgnoreCase("Lorry")) {
            vehiclePrice = 1700;
        } else {
            vehiclePrice = 3000;
        }

        return (price + vehiclePrice + tax) - discount;
    }
}
