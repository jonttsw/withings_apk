package com.withings.wiscale2.dashboard.item;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import com.withings.coach.chatbot.d;
import com.withings.device.Device;
import com.withings.environment.ui.WS50Activity;
import com.withings.environment.ui.Wsd01EnvironmentActivity;
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
import org.joda.time.DateTime;
import qb0.f;
import za0.b;
/* compiled from: RoomTemperatureSummaryItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/withings/wiscale2/dashboard/item/RoomTemperatureSummaryView;", "Lcom/withings/wiscale2/dashboard/item/model/BaseSummaryItemView;", "Lqb0/f;", "Lcom/withings/device/Device;", "device", "Lnm0/y;", "setTitleAccordingDevice", "(Lcom/withings/device/Device;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RoomTemperatureSummaryView extends BaseSummaryItemView<f> {
    public static final /* synthetic */ int P = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomTemperatureSummaryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        u.j(context, "context");
    }

    public static void E(RoomTemperatureSummaryView this$0, Device device) {
        u.j(this$0, "this$0");
        u.j(device, "$device");
        this$0.G(device);
    }

    public static void F(RoomTemperatureSummaryView this$0, f data) {
        u.j(this$0, "this$0");
        u.j(data, "$data");
        this$0.G(data.a());
    }

    private final void G(Device device) {
        if (device.getModelId() == 60) {
            Context context = getContext();
            Context context2 = getContext();
            DateTime now = DateTime.now();
            int i11 = Wsd01EnvironmentActivity.f38967j;
            context.startActivity(new Intent(context2, Wsd01EnvironmentActivity.class).putExtra("EXTRA_DEVICE", device).putExtra("EXTRA_DATE", now));
            return;
        }
        Context context3 = getContext();
        Context context4 = getContext();
        int i12 = WS50Activity.f38958e;
        Intent intent = new Intent(context4, WS50Activity.class);
        intent.putExtra("device_model", device);
        context3.startActivity(intent);
    }

    private final void setTitleAccordingDevice(Device device) {
        Context context = getContext();
        u.i(context, "getContext(...)");
        String n11 = t.n(device, context, getHmDeviceModelFactory(), getDeviceManager());
        String string = getContext().getString(C1987R.string._TEMPERATURE_);
        setCategory(string + " (" + n11 + ")");
    }

    @Override // com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView
    public final void D(c cVar) {
        Device device = (Device) x.I(cVar.e());
        setTitleAccordingDevice(device);
        w(C1987R.drawable.icon_medium_feature_temperature);
        setOnClickListener(new b(1, this, device));
    }

    @Override // com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView
    public final void t(c cVar) {
        x(C1987R.drawable.icon_medium_feature_temperature, C1987R.color.statusInfo);
    }

    @Override // com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView
    public final void z(User user, f fVar) {
        f fVar2 = fVar;
        u.j(user, "user");
        setTitleAccordingDevice(fVar2.a());
        Context context = getContext();
        u.i(context, "getContext(...)");
        setValue(a.c(a.d.a(context), fVar2.c(), fVar2.d(), 0, 0, 60));
        A(fVar2.b(), false);
        setOnClickListener(new d(1, this, fVar2));
    }

    public /* synthetic */ RoomTemperatureSummaryView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomTemperatureSummaryView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, C1987R.id.dashboard_env_room_temperature);
        u.j(context, "context");
    }

    @Override // com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView
    public final void C(c cVar) {
    }
}
