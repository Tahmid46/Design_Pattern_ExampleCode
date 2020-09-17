package factory_method_pattern

class ReconditionCarStore : CarStore() {

    override fun carFactory(brand: CarBrands): Car = when(brand) {
        CarBrands.Toyota -> Toyota()
        CarBrands.Bmw -> Bmw()
    }
}