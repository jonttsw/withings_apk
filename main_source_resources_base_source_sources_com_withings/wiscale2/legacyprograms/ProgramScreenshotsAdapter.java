package com.withings.wiscale2.legacyprograms;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.programs.model.program.ScreenshotDomain;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.legacyprograms.WellnessProgramScreenshotsActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ProgramScreenshotsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/withings/wiscale2/legacyprograms/ScreenshotHolder;", "", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/withings/wiscale2/legacyprograms/ScreenshotHolder;", "holder", "position", "Lnm0/y;", "onBindViewHolder", "(Lcom/withings/wiscale2/legacyprograms/ScreenshotHolder;I)V", "", "Lcom/withings/programs/model/program/ScreenshotDomain;", "screenshots", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProgramScreenshotsAdapter extends RecyclerView.Adapter<ScreenshotHolder> {
    public static final int $stable = 8;
    private final List<ScreenshotDomain> screenshots;

    public ProgramScreenshotsAdapter(List<ScreenshotDomain> screenshots) {
        u.j(screenshots, "screenshots");
        this.screenshots = screenshots;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(Context context, ArrayList arrayScreenshots, int i11, View view) {
        u.j(arrayScreenshots, "$arrayScreenshots");
        WellnessProgramScreenshotsActivity.Companion companion = WellnessProgramScreenshotsActivity.Companion;
        u.g(context);
        context.startActivity(companion.createIntent(context, arrayScreenshots, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.screenshots.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ScreenshotHolder holder, final int i11) {
        u.j(holder, "holder");
        final Context context = holder.getView().getContext();
        holder.bind(this.screenshots.get(i11).getImage());
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.screenshots);
        holder.getView().setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.legacyprograms.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProgramScreenshotsAdapter.onBindViewHolder$lambda$0(context, arrayList, i11, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ScreenshotHolder onCreateViewHolder(ViewGroup parent, int i11) {
        u.j(parent, "parent");
        return new ScreenshotHolder(androidx.collection.c.n(parent, C1987R.layout.cell_item_screenshot_holder));
    }
}
