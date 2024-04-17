package com.withings.webradio.model;

import com.withings.webservices.legacy.withings.model.airable.WsAirableNode;
import com.withings.webservices.legacy.withings.model.airable.WsAirableSubCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: WebRadioNode.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\b\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"childCount", "", "Lcom/withings/webradio/model/WebRadioNode;", "getChildCount", "(Lcom/withings/webradio/model/WebRadioNode;)I", "getChildAt", "position", "toWebRadioNode", "Lcom/withings/webservices/legacy/withings/model/airable/WsAirableNode;", "Lcom/withings/webservices/legacy/withings/model/airable/WsAirableSubCategory;", "webradio_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebRadioNodeKt {
    public static final WebRadioNode getChildAt(WebRadioNode webRadioNode, int i11) {
        u.j(webRadioNode, "<this>");
        List<WebRadioNode> children = webRadioNode.getChildren();
        if (children != null) {
            return children.get(i11);
        }
        return null;
    }

    public static final int getChildCount(WebRadioNode webRadioNode) {
        u.j(webRadioNode, "<this>");
        List<WebRadioNode> children = webRadioNode.getChildren();
        if (children != null) {
            return children.size();
        }
        return 0;
    }

    public static final WebRadioNode toWebRadioNode(WsAirableNode wsAirableNode) {
        u.j(wsAirableNode, "<this>");
        String id2 = wsAirableNode.f46862id;
        u.i(id2, "id");
        String title = wsAirableNode.title;
        u.i(title, "title");
        long j5 = wsAirableNode.radios;
        List<WsAirableNode> children = wsAirableNode.children;
        u.i(children, "children");
        List<WsAirableNode> list = children;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (WsAirableNode wsAirableNode2 : list) {
            u.g(wsAirableNode2);
            arrayList.add(toWebRadioNode(wsAirableNode2));
        }
        return new WebRadioNode(id2, title, j5, arrayList);
    }

    public static final WebRadioNode toWebRadioNode(WsAirableSubCategory wsAirableSubCategory) {
        u.j(wsAirableSubCategory, "<this>");
        String id2 = wsAirableSubCategory.f46863id;
        u.i(id2, "id");
        String title = wsAirableSubCategory.title;
        u.i(title, "title");
        return new WebRadioNode(id2, title, wsAirableSubCategory.radios, null);
    }
}
