package com.withings.wiscale2.legacyprograms;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ProgramDeviceAdapter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ProgramDeviceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/withings/wiscale2/legacyprograms/DeviceViewHolder;", "", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/withings/wiscale2/legacyprograms/DeviceViewHolder;", "holder", "Lnm0/y;", "onBindViewHolder", "(Lcom/withings/wiscale2/legacyprograms/DeviceViewHolder;I)V", "highlightMissingDevices", "()V", "", NavigationArguments.USER_ID, "J", "getUserId", "()J", "setUserId", "(J)V", "", "Lcom/withings/wiscale2/legacyprograms/ProgramDeviceContainer;", "programDevicesWrapper", "Ljava/util/List;", "getProgramDevicesWrapper", "()Ljava/util/List;", "setProgramDevicesWrapper", "(Ljava/util/List;)V", "", "showError", "Z", "getShowError", "()Z", "setShowError", "(Z)V", "<init>", "(JLjava/util/List;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProgramDeviceAdapter extends RecyclerView.Adapter<DeviceViewHolder> {
    public static final int $stable = 8;
    private List<ProgramDeviceContainer> programDevicesWrapper;
    private boolean showError;
    private long userId;

    public ProgramDeviceAdapter(long j5, List<ProgramDeviceContainer> programDevicesWrapper) {
        u.j(programDevicesWrapper, "programDevicesWrapper");
        this.userId = j5;
        this.programDevicesWrapper = programDevicesWrapper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.programDevicesWrapper.size();
    }

    public final List<ProgramDeviceContainer> getProgramDevicesWrapper() {
        return this.programDevicesWrapper;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void highlightMissingDevices() {
        this.showError = true;
        notifyDataSetChanged();
    }

    public final void setProgramDevicesWrapper(List<ProgramDeviceContainer> list) {
        u.j(list, "<set-?>");
        this.programDevicesWrapper = list;
    }

    public final void setShowError(boolean z5) {
        this.showError = z5;
    }

    public final void setUserId(long j5) {
        this.userId = j5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(DeviceViewHolder holder, int i11) {
        u.j(holder, "holder");
        holder.bind(this.userId, this.programDevicesWrapper.get(i11), this.showError);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public DeviceViewHolder onCreateViewHolder(ViewGroup parent, int i11) {
        u.j(parent, "parent");
        return new DeviceViewHolder(androidx.collection.c.n(parent, C1987R.layout.cell_item_device_holder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        return i11;
    }
}
