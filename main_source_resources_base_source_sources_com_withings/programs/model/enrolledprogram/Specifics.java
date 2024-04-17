package com.withings.programs.model.enrolledprogram;

import androidx.camera.camera2.internal.l0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Specifics.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/withings/programs/model/enrolledprogram/Specifics;", "", "imagePreview", "", "imageFull", "title", "tags", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getImageFull", "()Ljava/lang/String;", "getImagePreview", "getTags", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Specifics {
    private final String imageFull;
    private final String imagePreview;
    private final List<String> tags;
    private final String title;

    public Specifics(String imagePreview, String imageFull, String title, List<String> tags) {
        u.j(imagePreview, "imagePreview");
        u.j(imageFull, "imageFull");
        u.j(title, "title");
        u.j(tags, "tags");
        this.imagePreview = imagePreview;
        this.imageFull = imageFull;
        this.title = title;
        this.tags = tags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Specifics copy$default(Specifics specifics, String str, String str2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = specifics.imagePreview;
        }
        if ((i11 & 2) != 0) {
            str2 = specifics.imageFull;
        }
        if ((i11 & 4) != 0) {
            str3 = specifics.title;
        }
        if ((i11 & 8) != 0) {
            list = specifics.tags;
        }
        return specifics.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.imagePreview;
    }

    public final String component2() {
        return this.imageFull;
    }

    public final String component3() {
        return this.title;
    }

    public final List<String> component4() {
        return this.tags;
    }

    public final Specifics copy(String imagePreview, String imageFull, String title, List<String> tags) {
        u.j(imagePreview, "imagePreview");
        u.j(imageFull, "imageFull");
        u.j(title, "title");
        u.j(tags, "tags");
        return new Specifics(imagePreview, imageFull, title, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Specifics)) {
            return false;
        }
        Specifics specifics = (Specifics) obj;
        if (u.e(this.imagePreview, specifics.imagePreview) && u.e(this.imageFull, specifics.imageFull) && u.e(this.title, specifics.title) && u.e(this.tags, specifics.tags)) {
            return true;
        }
        return false;
    }

    public final String getImageFull() {
        return this.imageFull;
    }

    public final String getImagePreview() {
        return this.imagePreview;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.tags.hashCode() + d.c(this.title, d.c(this.imageFull, this.imagePreview.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.imagePreview;
        String str2 = this.imageFull;
        String str3 = this.title;
        List<String> list = this.tags;
        StringBuilder b10 = l0.b("Specifics(imagePreview=", str, ", imageFull=", str2, ", title=");
        b10.append(str3);
        b10.append(", tags=");
        b10.append(list);
        b10.append(")");
        return b10.toString();
    }
}
