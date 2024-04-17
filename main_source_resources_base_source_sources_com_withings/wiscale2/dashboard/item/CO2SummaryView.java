package com.withings.wiscale2.dashboard.item;

import android.content.Context;
import android.util.AttributeSet;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView;
import com.withings.wiscale2.dashboard.item.model.c;
import jm.a;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import m0.t;
import qb0.a;
/* compiled from: CO2SummaryItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/withings/wiscale2/dashboard/item/CO2SummaryView;", "Lcom/withings/wiscale2/dashboard/item/model/BaseSummaryItemView;", "Lqb0/a;", "Lcom/withings/device/Device;", "device", "Lnm0/y;", "setTitleAccordingDevice", "(Lcom/withings/device/Device;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CO2SummaryView extends BaseSummaryItemView<a> {
    public static final /* synthetic */ int P = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CO2SummaryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        u.j(context, "context");
    }

    private final void setTitleAccordingDevice(Device device) {
        Context context = getContext();
        u.i(context, "getContext(...)");
        String n11 = t.n(device, context, getHmDeviceModelFactory(), getDeviceManager());
        String string = getContext().getString(C1987R.string._CO2_);
        setCategory(string + " (" + n11 + ")");
    }

    @Override // com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView
    public final void D(c cVar) {
        setTitleAccordingDevice((Device) x.I(cVar.e()));
        w(C1987R.drawable.ic_stock_feather2_white);
    }

    @Override // com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView
    public final void z(User user, a aVar) {
        a aVar2 = aVar;
        u.j(user, "user");
        setTitleAccordingDevice(aVar2.b());
        Context context = getContext();
        u.i(context, "getContext(...)");
        setValue(jm.a.c(a.d.a(context), aVar2.d(), aVar2.e(), 0, 0, 60));
        x(C1987R.drawable.ic_stock_feather2_white, aVar2.a());
        A(aVar2.c(), false);
        setOnClickListener(new qb0.c(0, this, aVar2));
    }

    public /* synthetic */ CO2SummaryView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CO2SummaryView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, C1987R.id.dashboard_env_room_co2);
        u.j(context, "context");
    }

    @Override // com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView
    public final void C(c cVar) {
    }
}
