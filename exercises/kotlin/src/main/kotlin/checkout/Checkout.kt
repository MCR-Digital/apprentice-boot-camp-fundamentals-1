package checkout

internal class Checkout {
    private var total = 0
    private var numberOfA = 0
    private var numberOfB = 0
    private val receipt: Receipt = Receipt()
    fun scan(sku: String) {
        if ("A" == sku) {
            total += 50
            receipt.scannedA()
        } else if ("B" == sku) {
            total += 30
            receipt.scannedB()
        } else if ("C" == sku) {
            total += 20
            receipt.scannedC()
        } else if ("D" == sku) {
            total += 15
            receipt.scannedD()
        }
        if ("A" == sku) {
            numberOfA++
            if (numberOfA % 3 == 0) {
                total -= 20
            }
        } else if ("B" == sku) {
            numberOfB++
            if (numberOfB % 2 == 0) {
                total -= 15
            }
        }
    }

    fun total(): Int {
        return total
    }

    fun receipt(): String {
        return receipt.text()
    }
}
