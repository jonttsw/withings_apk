package com.withings.wiscale2.legacyprograms;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.legacyprograms.WellnessProgramArchiveActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WellnessProgramArchiveActivity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ProgramArchiveAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/withings/wiscale2/legacyprograms/ProgramArchiveHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/withings/wiscale2/legacyprograms/ProgramArchiveHolder;", "holder", "position", "Lnm0/y;", "onBindViewHolder", "(Lcom/withings/wiscale2/legacyprograms/ProgramArchiveHolder;I)V", "getItemCount", "()I", "", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramArchiveActivity$ProgramWithIteration;", "archivedPrograms", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProgramArchiveAdapter extends RecyclerView.Adapter<ProgramArchiveHolder> {
    public static final int $stable = 8;
    private final List<WellnessProgramArchiveActivity.ProgramWithIteration> archivedPrograms;

    public ProgramArchiveAdapter(List<WellnessProgramArchiveActivity.ProgramWithIteration> archivedPrograms) {
        u.j(archivedPrograms, "archivedPrograms");
        this.archivedPrograms = archivedPrograms;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.archivedPrograms.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ProgramArchiveHolder holder, int i11) {
        u.j(holder, "holder");
        holder.bind(this.archivedPrograms.get(i11), i11 != this.archivedPrograms.size() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ProgramArchiveHolder onCreateViewHolder(ViewGroup parent, int i11) {
        u.j(parent, "parent");
        return new ProgramArchiveHolder(androidx.collection.c.n(parent, C1987R.layout.cell_item_ongoing_program));
    }
}
