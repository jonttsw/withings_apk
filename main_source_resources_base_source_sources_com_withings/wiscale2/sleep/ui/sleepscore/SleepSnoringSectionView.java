package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.SleepLevel;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepStat;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: SleepSnoringSectionView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepSnoringSectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/util/AttributeSet;", "t", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "Lcom/withings/graph/GraphView;", ConstantsWs.JSON_SESSION_KEY_VALUE, "Lcom/withings/graph/GraphView;", "getSnoringGraph$HealthMate_prodRelease", "()Lcom/withings/graph/GraphView;", "snoringGraph", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepSnoringSectionView extends ConstraintLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f60871x = 0;

    /* renamed from: t  reason: collision with root package name */
    private final AttributeSet f60872t;

    /* renamed from: u  reason: collision with root package name */
    private final LineCellView f60873u;

    /* renamed from: v  reason: collision with root package name */
    private final GraphView f60874v;

    /* renamed from: w  reason: collision with root package name */
    private final GraphPopupView f60875w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SleepSnoringSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    public final AttributeSet getAttrs() {
        return this.f60872t;
    }

    public final GraphView getSnoringGraph$HealthMate_prodRelease() {
        return this.f60874v;
    }

    public final void t(SleepStat sleepStat, Track track, List aggregatedVasistas, ArrayList arrayList) {
        boolean z5;
        Object obj;
        DateTime asleepStartDate;
        Object obj2;
        DateTime awakeStartDate;
        kotlin.jvm.internal.u.j(aggregatedVasistas, "aggregatedVasistas");
        nm0.y yVar = null;
        if (sleepStat != null) {
            String formattedValue = sleepStat.getFormattedValue();
            LineCellView lineCellView = this.f60873u;
            lineCellView.setValue(formattedValue);
            lineCellView.setOnClickListener(new k40.a(3, this, sleepStat));
            int i11 = 0;
            if (sleepStat.getValue() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i11 = 8;
            }
            GraphView graphView = this.f60874v;
            graphView.setVisibility(i11);
            if (z5 && track != null && !aggregatedVasistas.isEmpty()) {
                Iterator it = aggregatedVasistas.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Vasistas) obj).getSleepLevel() != SleepLevel.Awake.getVasistasType()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Vasistas vasistas = (Vasistas) obj;
                if (vasistas == null || (asleepStartDate = vasistas.getStartDate()) == null) {
                    asleepStartDate = TrackKt.getAsleepStartDate(track);
                }
                ListIterator listIterator = aggregatedVasistas.listIterator(aggregatedVasistas.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((Vasistas) obj2).getSleepLevel() != SleepLevel.Awake.getVasistasType()) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Vasistas vasistas2 = (Vasistas) obj2;
                if (vasistas2 == null || (awakeStartDate = vasistas2.getEnd()) == null) {
                    awakeStartDate = TrackKt.getAwakeStartDate(track);
                }
                graphView.setLayerType(1, null);
                new ii0.e(this.f60874v, arrayList, this.f60875w, false, false, false).x(asleepStartDate, awakeStartDate);
            }
            yVar = nm0.y.f85009a;
        }
        if (yVar == null) {
            setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepSnoringSectionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
        this.f60872t = attributeSet;
        View inflate = LayoutInflater.from(getContext()).inflate(C1987R.layout.view_sleep_snoring_section, this);
        View findViewById = inflate.findViewById(C1987R.id.snoring_linecellview);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f60873u = (LineCellView) findViewById;
        View findViewById2 = inflate.findViewById(C1987R.id.snoring_graph);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f60874v = (GraphView) findViewById2;
        View findViewById3 = inflate.findViewById(C1987R.id.snoring_graph_popup);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        GraphPopupView graphPopupView = (GraphPopupView) findViewById3;
        this.f60875w = graphPopupView;
        graphPopupView.setShouldAlignToTopOfGraphView(false);
    }
}
