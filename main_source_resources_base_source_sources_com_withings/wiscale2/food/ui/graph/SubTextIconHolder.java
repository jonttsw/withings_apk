package com.withings.wiscale2.food.ui.graph;

import android.graphics.drawable.Drawable;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.e;
import com.withings.views.graphs.GraphPopupView;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: FoodWeekGraphFactory.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0007J.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004\"\u0004\b\u001c\u0010\u001dR\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010!R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010!¨\u0006&"}, d2 = {"Lcom/withings/wiscale2/food/ui/graph/SubTextIconHolder;", "Lcom/withings/views/graphs/GraphPopupView$a;", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "", "getIconHeight", "()I", "getIconWidth", "component1", "component2", "component3", "drawable", "drawableWidth", "drawableHeight", "copy", "(Landroid/graphics/drawable/Drawable;II)Lcom/withings/wiscale2/food/ui/graph/SubTextIconHolder;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/drawable/Drawable;", "getDrawable", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "I", "getDrawableWidth", "setDrawableWidth", "(I)V", "getDrawableHeight", "setDrawableHeight", "<init>", "(Landroid/graphics/drawable/Drawable;II)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SubTextIconHolder implements GraphPopupView.a {
    public static final int $stable = 8;
    private Drawable drawable;
    private int drawableHeight;
    private int drawableWidth;

    public SubTextIconHolder(Drawable drawable, int i11, int i12) {
        u.j(drawable, "drawable");
        this.drawable = drawable;
        this.drawableWidth = i11;
        this.drawableHeight = i12;
    }

    public static /* synthetic */ SubTextIconHolder copy$default(SubTextIconHolder subTextIconHolder, Drawable drawable, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            drawable = subTextIconHolder.drawable;
        }
        if ((i13 & 2) != 0) {
            i11 = subTextIconHolder.drawableWidth;
        }
        if ((i13 & 4) != 0) {
            i12 = subTextIconHolder.drawableHeight;
        }
        return subTextIconHolder.copy(drawable, i11, i12);
    }

    public final Drawable component1() {
        return this.drawable;
    }

    public final int component2() {
        return this.drawableWidth;
    }

    public final int component3() {
        return this.drawableHeight;
    }

    public final SubTextIconHolder copy(Drawable drawable, int i11, int i12) {
        u.j(drawable, "drawable");
        return new SubTextIconHolder(drawable, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubTextIconHolder)) {
            return false;
        }
        SubTextIconHolder subTextIconHolder = (SubTextIconHolder) obj;
        if (u.e(this.drawable, subTextIconHolder.drawable) && this.drawableWidth == subTextIconHolder.drawableWidth && this.drawableHeight == subTextIconHolder.drawableHeight) {
            return true;
        }
        return false;
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final int getDrawableHeight() {
        return this.drawableHeight;
    }

    public final int getDrawableWidth() {
        return this.drawableWidth;
    }

    @Override // com.withings.views.graphs.GraphPopupView.a
    public Drawable getIcon() {
        return this.drawable;
    }

    @Override // com.withings.views.graphs.GraphPopupView.a
    public int getIconHeight() {
        return this.drawableHeight;
    }

    @Override // com.withings.views.graphs.GraphPopupView.a
    public int getIconWidth() {
        return this.drawableWidth;
    }

    public int hashCode() {
        return Integer.hashCode(this.drawableHeight) + h.a(this.drawableWidth, this.drawable.hashCode() * 31, 31);
    }

    public final void setDrawable(Drawable drawable) {
        u.j(drawable, "<set-?>");
        this.drawable = drawable;
    }

    public final void setDrawableHeight(int i11) {
        this.drawableHeight = i11;
    }

    public final void setDrawableWidth(int i11) {
        this.drawableWidth = i11;
    }

    public String toString() {
        Drawable drawable = this.drawable;
        int i11 = this.drawableWidth;
        int i12 = this.drawableHeight;
        StringBuilder sb2 = new StringBuilder("SubTextIconHolder(drawable=");
        sb2.append(drawable);
        sb2.append(", drawableWidth=");
        sb2.append(i11);
        sb2.append(", drawableHeight=");
        return e.c(sb2, i12, ")");
    }
}
