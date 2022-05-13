package br.com.cod3r.template.sales.service.template;

import br.com.cod3r.template.sales.model.Cart;

public class BlackFriday extends BestOfferTemplate{

    public BlackFriday(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        return true;  //FIXME we should use calendar to be dinamic
    }

    @Override
    protected void calibrateVariables() {
        priceFactor = 0.75d;
    }
}
