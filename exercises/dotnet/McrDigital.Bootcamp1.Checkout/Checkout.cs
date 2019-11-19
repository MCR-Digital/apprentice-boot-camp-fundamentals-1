namespace McrDigital.Bootcamp1.Checkout
{
    public class Checkout
    {
        private int _total;
        private int _numberOfA;
        private int _numberOfB;
        private Receipt _receipt = new Receipt();

        public string Receipt
        {
            get => _receipt.Text;
        }

        public int Total
        {
            get => _total;
        }

        public void Scan(string sku)
        {
            if ("A".Equals(sku))
            {
                _total += 50;
                _receipt.ScannedA();
            }
            else if ("B".Equals(sku))
            {
                _total += 30;
                _receipt.ScannedB();
            }
            else if ("C".Equals(sku))
            {
                _total += 20;
                _receipt.ScannedC();
            }
            else if ("D".Equals(sku))
            {
                _total += 15;
                _receipt.ScannedD();
            }

            if ("A".Equals(sku))
            {
                _numberOfA++;
                if (_numberOfA % 3 == 0)
                {
                    _total -= 20;
                }
            }
            else if ("B".Equals(sku))
            {
                _numberOfB++;
                if (_numberOfB % 2 == 0)
                {
                    _total -= 15;
                }
            }
        }
    }
}