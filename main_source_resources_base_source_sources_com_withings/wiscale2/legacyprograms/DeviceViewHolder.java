package com.withings.wiscale2.legacyprograms;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.programs.model.program.DeviceDomain;
import com.withings.wiscale2.C1987R;
import fl.p;
import ga.f;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Bind;
/* compiled from: ProgramDeviceAdapter.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/DeviceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$z;", "Lcom/withings/wiscale2/legacyprograms/ProgramDeviceContainer;", "programDeviceWrapper", "", "showError", "Landroid/graphics/drawable/Drawable;", "getStateDrawable", "(Lcom/withings/wiscale2/legacyprograms/ProgramDeviceContainer;Z)Landroid/graphics/drawable/Drawable;", "", NavigationArguments.USER_ID, "Lnm0/y;", Bind.ELEMENT, "(JLcom/withings/wiscale2/legacyprograms/ProgramDeviceContainer;Z)V", "Landroid/widget/ImageView;", "deviceImage$delegate", "Lnm0/g;", "getDeviceImage", "()Landroid/widget/ImageView;", "deviceImage", "deviceState$delegate", "getDeviceState", "deviceState", "deviceStateBorder$delegate", "getDeviceStateBorder", "deviceStateBorder", "Landroid/widget/TextView;", "deviceName$delegate", "getDeviceName", "()Landroid/widget/TextView;", "deviceName", "Lcom/withings/programs/model/program/DeviceDomain;", "device", "Lcom/withings/programs/model/program/DeviceDomain;", "getDevice", "()Lcom/withings/programs/model/program/DeviceDomain;", "setDevice", "(Lcom/withings/programs/model/program/DeviceDomain;)V", "J", "getUserId", "()J", "setUserId", "(J)V", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeviceViewHolder extends RecyclerView.z {
    public static final int $stable = 8;
    private DeviceDomain device;
    private final g deviceImage$delegate;
    private final g deviceName$delegate;
    private final g deviceState$delegate;
    private final g deviceStateBorder$delegate;
    private long userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceViewHolder(View view) {
        super(view);
        u.j(view, "view");
        this.deviceImage$delegate = h.b(new DeviceViewHolder$deviceImage$2(view));
        this.deviceState$delegate = h.b(new DeviceViewHolder$deviceState$2(view));
        this.deviceStateBorder$delegate = h.b(new DeviceViewHolder$deviceStateBorder$2(view));
        this.deviceName$delegate = h.b(new DeviceViewHolder$deviceName$2(view));
        this.device = new DeviceDomain("", 0, false);
    }

    private final ImageView getDeviceImage() {
        Object value = this.deviceImage$delegate.getValue();
        u.i(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getDeviceName() {
        Object value = this.deviceName$delegate.getValue();
        u.i(value, "getValue(...)");
        return (TextView) value;
    }

    private final ImageView getDeviceState() {
        Object value = this.deviceState$delegate.getValue();
        u.i(value, "getValue(...)");
        return (ImageView) value;
    }

    private final ImageView getDeviceStateBorder() {
        Object value = this.deviceStateBorder$delegate.getValue();
        u.i(value, "getValue(...)");
        return (ImageView) value;
    }

    private final Drawable getStateDrawable(ProgramDeviceContainer programDeviceContainer, boolean z5) {
        int i11;
        if (programDeviceContainer.getHasDevice()) {
            Context context = this.itemView.getContext();
            u.i(context, "getContext(...)");
            Drawable drawable = androidx.core.content.a.getDrawable(this.itemView.getContext(), C1987R.drawable.ic_rounded_ok_filled);
            y70.a.b(C1987R.color.heart, context, drawable);
            return drawable;
        }
        ImageView deviceState = getDeviceState();
        int i12 = 8;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        deviceState.setVisibility(i11);
        ImageView deviceStateBorder = getDeviceStateBorder();
        if (z5) {
            i12 = 0;
        }
        deviceStateBorder.setVisibility(i12);
        Context context2 = this.itemView.getContext();
        u.i(context2, "getContext(...)");
        Drawable drawable2 = androidx.core.content.a.getDrawable(this.itemView.getContext(), C1987R.drawable.ic_rounded_nok2);
        y70.a.b(C1987R.color.statusBad, context2, drawable2);
        return drawable2;
    }

    public final void bind(long j5, ProgramDeviceContainer programDeviceWrapper, boolean z5) {
        u.j(programDeviceWrapper, "programDeviceWrapper");
        this.userId = j5;
        this.device = programDeviceWrapper.getProgramDevice();
        Context context = getDeviceImage().getContext();
        ImageView deviceImage = getDeviceImage();
        String image = this.device.getImage();
        w9.g a11 = w9.a.a(deviceImage.getContext());
        f.a aVar = new f.a(deviceImage.getContext());
        aVar.d(image);
        aVar.q(deviceImage);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(C1987R.dimen.device_radius);
        aVar.s(new ja.b(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize));
        a11.d(aVar.b());
        getDeviceState().setImageDrawable(getStateDrawable(programDeviceWrapper, z5));
        getDeviceName().setText(zq.b.b(this, p.f67672b.a().d(this.device.getModel()).I(null)));
    }

    public final DeviceDomain getDevice() {
        return this.device;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setDevice(DeviceDomain deviceDomain) {
        u.j(deviceDomain, "<set-?>");
        this.device = deviceDomain;
    }

    public final void setUserId(long j5) {
        this.userId = j5;
    }
}
