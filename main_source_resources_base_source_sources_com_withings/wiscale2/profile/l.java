package com.withings.wiscale2.profile;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.partner.exchanges.google.healthconnect.HealthConnect;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.profile.v0;
import kotlinx.coroutines.BuildersKt__BuildersKt;
/* compiled from: ProfilePartnerAdapter.kt */
/* loaded from: classes5.dex */
public final class l extends RecyclerView.z {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f59388e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final View f59389a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f59390b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f59391c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f59392d;

    /* compiled from: ProfilePartnerAdapter.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<ImageView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) l.this.getView().findViewById(C1987R.id.partner_image);
        }
    }

    /* compiled from: ProfilePartnerAdapter.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) l.this.getView().findViewById(C1987R.id.partner_name);
        }
    }

    /* compiled from: ProfilePartnerAdapter.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<ImageView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) l.this.getView().findViewById(C1987R.id.partner_state);
        }
    }

    public l(View view) {
        super(view);
        this.f59389a = view;
        this.f59390b = nm0.h.b(new a());
        this.f59391c = nm0.h.b(new c());
        this.f59392d = nm0.h.b(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView c() {
        return (ImageView) this.f59391c.getValue();
    }

    public final void b(Partner partner, v0.a aVar, kg0.c hasPartnerWarningAssociationStatusUseCase) {
        int i11;
        Object runBlocking$default;
        kotlin.jvm.internal.u.j(hasPartnerWarningAssociationStatusUseCase, "hasPartnerWarningAssociationStatusUseCase");
        nm0.g gVar = this.f59392d;
        TextView textView = (TextView) gVar.getValue();
        kotlin.jvm.internal.u.i(textView, "<get-partnerName>(...)");
        ((TextView) gVar.getValue()).setText(com.withings.wiscale2.spo2.m.h(textView, partner.w()));
        ((ImageView) this.f59390b.getValue()).setImageResource(partner.v());
        Context context = this.f59389a.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        boolean J = partner.J(context);
        ImageView c11 = c();
        kotlin.jvm.internal.u.i(c11, "<get-partnerState>(...)");
        int l5 = partner.l();
        Partner partner2 = Partner.f43457o;
        if ((l5 == partner2.l() && HealthConnect.Checker.b() == HealthConnect.Checker.HealthConnectAvailability.f43380a) || (partner.l() != partner2.l() && J)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c11.setVisibility(i11);
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new m(hasPartnerWarningAssociationStatusUseCase, this, partner, J, null), 1, null);
        if (((Boolean) runBlocking$default).booleanValue()) {
            ImageView c12 = c();
            kotlin.jvm.internal.u.i(c12, "<get-partnerState>(...)");
            if (c12.getVisibility() == 0) {
                c().setBackgroundResource(C1987R.drawable.red_circle);
                ImageView c13 = c();
                Context context2 = c().getContext();
                kotlin.jvm.internal.u.i(context2, "getContext(...)");
                c13.setImageDrawable(y70.a.a(C1987R.drawable.icon_medium_status_moderate, context2, 17170443));
            }
        } else if (J) {
            ImageView c14 = c();
            kotlin.jvm.internal.u.i(c14, "<get-partnerState>(...)");
            if (c14.getVisibility() == 0) {
                c().setBackgroundResource(C1987R.drawable.green_circle_white_border);
                ImageView c15 = c();
                Context context3 = c().getContext();
                kotlin.jvm.internal.u.i(context3, "getContext(...)");
                c15.setImageDrawable(y70.a.a(C1987R.drawable.ic_check_cshaded4_24dp, context3, 17170443));
            }
        }
        this.itemView.setOnClickListener(new com.withings.wiscale2.device.common.feature.afib.j(4, aVar, partner));
    }

    public final View getView() {
        return this.f59389a;
    }
}
