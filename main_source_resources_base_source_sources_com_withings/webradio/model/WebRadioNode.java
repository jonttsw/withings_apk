package com.withings.webradio.model;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.l0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: WebRadioNode.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/withings/webradio/model/WebRadioNode;", "", "id", "", "title", "radios", "", "children", "", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "getChildren", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getRadios", "()J", "getTitle", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "webradio_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebRadioNode {
    private final List<WebRadioNode> children;

    /* renamed from: id  reason: collision with root package name */
    private final String f46840id;
    private final long radios;
    private String title;

    public WebRadioNode() {
        this(null, null, 0L, null, 15, null);
    }

    public static /* synthetic */ WebRadioNode copy$default(WebRadioNode webRadioNode, String str, String str2, long j5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = webRadioNode.f46840id;
        }
        if ((i11 & 2) != 0) {
            str2 = webRadioNode.title;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            j5 = webRadioNode.radios;
        }
        long j11 = j5;
        List<WebRadioNode> list2 = list;
        if ((i11 & 8) != 0) {
            list2 = webRadioNode.children;
        }
        return webRadioNode.copy(str, str3, j11, list2);
    }

    public final String component1() {
        return this.f46840id;
    }

    public final String component2() {
        return this.title;
    }

    public final long component3() {
        return this.radios;
    }

    public final List<WebRadioNode> component4() {
        return this.children;
    }

    public final WebRadioNode copy(String id2, String title, long j5, List<WebRadioNode> list) {
        u.j(id2, "id");
        u.j(title, "title");
        return new WebRadioNode(id2, title, j5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebRadioNode)) {
            return false;
        }
        WebRadioNode webRadioNode = (WebRadioNode) obj;
        if (u.e(this.f46840id, webRadioNode.f46840id) && u.e(this.title, webRadioNode.title) && this.radios == webRadioNode.radios && u.e(this.children, webRadioNode.children)) {
            return true;
        }
        return false;
    }

    public final List<WebRadioNode> getChildren() {
        return this.children;
    }

    public final String getId() {
        return this.f46840id;
    }

    public final long getRadios() {
        return this.radios;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int a11 = c.a(this.radios, d.c(this.title, this.f46840id.hashCode() * 31, 31), 31);
        List<WebRadioNode> list = this.children;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return a11 + hashCode;
    }

    public final void setTitle(String str) {
        u.j(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        String str = this.f46840id;
        String str2 = this.title;
        long j5 = this.radios;
        List<WebRadioNode> list = this.children;
        StringBuilder b10 = l0.b("WebRadioNode(id=", str, ", title=", str2, ", radios=");
        b10.append(j5);
        b10.append(", children=");
        b10.append(list);
        b10.append(")");
        return b10.toString();
    }

    public WebRadioNode(String id2, String title, long j5, List<WebRadioNode> list) {
        u.j(id2, "id");
        u.j(title, "title");
        this.f46840id = id2;
        this.title = title;
        this.radios = j5;
        this.children = list;
    }

    public /* synthetic */ WebRadioNode(String str, String str2, long j5, List list, int i11, m mVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) == 0 ? str2 : "", (i11 & 4) != 0 ? 0L : j5, (i11 & 8) != 0 ? new ArrayList() : list);
    }
}
