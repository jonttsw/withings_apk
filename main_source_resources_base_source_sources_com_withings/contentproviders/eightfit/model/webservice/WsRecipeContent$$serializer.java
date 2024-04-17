package com.withings.contentproviders.eightfit.model.webservice;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: WsRecipeContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/webservice/WsRecipeContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsRecipeContent$$serializer implements GeneratedSerializer<WsRecipeContent> {
    public static final WsRecipeContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsRecipeContent$$serializer wsRecipeContent$$serializer = new WsRecipeContent$$serializer();
        INSTANCE = wsRecipeContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.webservice.WsRecipeContent", wsRecipeContent$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement("contextualizedDescription", false);
        pluginGeneratedSerialDescriptor.addElement("contextualized", false);
        pluginGeneratedSerialDescriptor.addElement("nutritionalValue", false);
        pluginGeneratedSerialDescriptor.addElement("ingredients", false);
        pluginGeneratedSerialDescriptor.addElement("instructions", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsRecipeContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = WsRecipeContent.access$get$childSerializers$cp();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(WsContextualized$$serializer.INSTANCE), access$get$childSerializers$cp[5], access$get$childSerializers$cp[6], access$get$childSerializers$cp[7], access$get$childSerializers$cp[8]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsRecipeContent deserialize(Decoder decoder) {
        int i11;
        List list;
        List list2;
        List list3;
        List list4;
        WsContextualized wsContextualized;
        String str;
        String str2;
        String str3;
        String str4;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] access$get$childSerializers$cp = WsRecipeContent.access$get$childSerializers$cp();
        int i12 = 7;
        String str5 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 2);
            list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 8, access$get$childSerializers$cp[8], null);
            str2 = decodeStringElement;
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, null);
            wsContextualized = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, 4, WsContextualized$$serializer.INSTANCE, null);
            str4 = decodeStringElement3;
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 7, access$get$childSerializers$cp[7], null);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 6, access$get$childSerializers$cp[6], null);
            list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, access$get$childSerializers$cp[5], null);
            i11 = 511;
            str3 = decodeStringElement2;
        } else {
            boolean z5 = true;
            int i13 = 0;
            List list5 = null;
            List list6 = null;
            List list7 = null;
            List list8 = null;
            WsContextualized wsContextualized2 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        i13 |= 1;
                        str5 = beginStructure.decodeStringElement(descriptor2, 0);
                        i12 = 7;
                        break;
                    case 1:
                        i13 |= 2;
                        str7 = beginStructure.decodeStringElement(descriptor2, 1);
                        i12 = 7;
                        break;
                    case 2:
                        str8 = beginStructure.decodeStringElement(descriptor2, 2);
                        i13 |= 4;
                        i12 = 7;
                        break;
                    case 3:
                        str6 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str6);
                        i13 |= 8;
                        i12 = 7;
                        break;
                    case 4:
                        wsContextualized2 = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, 4, WsContextualized$$serializer.INSTANCE, wsContextualized2);
                        i13 |= 16;
                        i12 = 7;
                        break;
                    case 5:
                        list7 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, access$get$childSerializers$cp[5], list7);
                        i13 |= 32;
                        i12 = 7;
                        break;
                    case 6:
                        list5 = (List) beginStructure.decodeSerializableElement(descriptor2, 6, access$get$childSerializers$cp[6], list5);
                        i13 |= 64;
                        i12 = 7;
                        continue;
                    case 7:
                        list6 = (List) beginStructure.decodeSerializableElement(descriptor2, i12, access$get$childSerializers$cp[i12], list6);
                        i13 |= 128;
                        break;
                    case 8:
                        list8 = (List) beginStructure.decodeSerializableElement(descriptor2, 8, access$get$childSerializers$cp[8], list8);
                        i13 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i13;
            list = list5;
            list2 = list6;
            list3 = list7;
            list4 = list8;
            wsContextualized = wsContextualized2;
            str = str6;
            str2 = str5;
            str3 = str7;
            str4 = str8;
        }
        beginStructure.endStructure(descriptor2);
        return new WsRecipeContent(i11, str2, str3, str4, str, wsContextualized, list3, list, list2, list4, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsRecipeContent value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsRecipeContent.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
