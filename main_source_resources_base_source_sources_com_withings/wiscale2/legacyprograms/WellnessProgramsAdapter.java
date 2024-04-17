package com.withings.wiscale2.legacyprograms;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: WellnessProgramsAdapter.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b$\u0010\u0015J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#¨\u0006&"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$z;", "", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$z;", "holder", "Lnm0/y;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$z;I)V", "Lcom/withings/wiscale2/legacyprograms/ProgramClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/withings/wiscale2/legacyprograms/ProgramClickListener;)V", "", "", "programsItems", "setProgramsItems", "(Ljava/util/List;)V", "", "hasOnGoingPrograms", "setHasOngoingPrograms", "(Z)V", "programClickListener", "Lcom/withings/wiscale2/legacyprograms/ProgramClickListener;", "", "Ljava/util/List;", "Z", "<init>", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramsAdapter extends RecyclerView.Adapter<RecyclerView.z> {
    private static final int VIEW_TYPE_PROGRAM = 1;
    private static final int VIEW_TYPE_TEXT = 0;
    private boolean hasOnGoingPrograms;
    private ProgramClickListener programClickListener;
    private final List<Object> programsItems;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WellnessProgramsAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramsAdapter$Companion;", "", "()V", "VIEW_TYPE_PROGRAM", "", "VIEW_TYPE_TEXT", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public WellnessProgramsAdapter(ProgramClickListener programClickListener) {
        u.j(programClickListener, "programClickListener");
        this.programClickListener = programClickListener;
        this.programsItems = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.programsItems.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        return this.programsItems.get(i11) instanceof ProgramDomain.LegacyDomain ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.z holder, int i11) {
        int i12;
        u.j(holder, "holder");
        if (this.programsItems.get(i11) instanceof ProgramDomain.LegacyDomain) {
            Object obj = this.programsItems.get(i11);
            u.h(obj, "null cannot be cast to non-null type com.withings.programs.model.program.ProgramDomain.LegacyDomain");
            ((WellnessProgramViewHolder) holder).bind((ProgramDomain.LegacyDomain) obj);
            return;
        }
        if (this.hasOnGoingPrograms) {
            i12 = C1987R.style.header3;
        } else {
            i12 = C1987R.style.header2;
        }
        Object obj2 = this.programsItems.get(i11);
        u.h(obj2, "null cannot be cast to non-null type com.withings.wiscale2.legacyprograms.WellnessProgramSection");
        WellnessProgramSection wellnessProgramSection = (WellnessProgramSection) obj2;
        ((WellnessProgramTextViewHolder) holder).bind(i12, wellnessProgramSection.getText(), wellnessProgramSection.getShowDivider());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        u.j(parent, "parent");
        if (i11 == 1) {
            return new WellnessProgramViewHolder(androidx.collection.c.n(parent, C1987R.layout.wellness_program_item), this.programClickListener);
        }
        return new WellnessProgramTextViewHolder(androidx.collection.c.n(parent, C1987R.layout.wellness_program_text_item));
    }

    public final void setHasOngoingPrograms(boolean z5) {
        this.hasOnGoingPrograms = z5;
    }

    public final void setListener(ProgramClickListener listener) {
        u.j(listener, "listener");
        this.programClickListener = listener;
    }

    public final void setProgramsItems(List<? extends Object> programsItems) {
        u.j(programsItems, "programsItems");
        this.programsItems.clear();
        this.programsItems.addAll(programsItems);
        notifyDataSetChanged();
    }
}
