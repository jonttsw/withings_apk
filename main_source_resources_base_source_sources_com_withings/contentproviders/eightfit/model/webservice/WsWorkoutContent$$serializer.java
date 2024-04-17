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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: WsWorkoutContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/webservice/WsWorkoutContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsWorkoutContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/webservice/WsWorkoutContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/webservice/WsWorkoutContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsWorkoutContent$$serializer implements GeneratedSerializer<WsWorkoutContent> {
    public static final WsWorkoutContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsWorkoutContent$$serializer wsWorkoutContent$$serializer = new WsWorkoutContent$$serializer();
        INSTANCE = wsWorkoutContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.webservice.WsWorkoutContent", wsWorkoutContent$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("dayIndex", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("contextualizedDescription", false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("prepareItems", false);
        pluginGeneratedSerialDescriptor.addElement("video", false);
        pluginGeneratedSerialDescriptor.addElement("hlsVideo", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedDevices", false);
        pluginGeneratedSerialDescriptor.addElement("contextualized", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsWorkoutContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = WsWorkoutContent.access$get$childSerializers$cp();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, IntSerializer.INSTANCE, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, access$get$childSerializers$cp[5], access$get$childSerializers$cp[6], stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), access$get$childSerializers$cp[9], BuiltinSerializersKt.getNullable(WsContextualized$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsWorkoutContent deserialize(Decoder decoder) {
        int i11;
        int i12;
        String str;
        List list;
        List list2;
        WsContextualized wsContextualized;
        List list3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i13;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] access$get$childSerializers$cp = WsWorkoutContent.access$get$childSerializers$cp();
        int i14 = 7;
        int i15 = 8;
        String str7 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 4);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 7);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 9, access$get$childSerializers$cp[9], null);
            str3 = decodeStringElement;
            list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, access$get$childSerializers$cp[5], null);
            str6 = decodeStringElement4;
            str2 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            str5 = decodeStringElement3;
            str4 = decodeStringElement2;
            wsContextualized = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, 10, WsContextualized$$serializer.INSTANCE, null);
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 6, access$get$childSerializers$cp[6], null);
            i11 = 2047;
            i12 = decodeIntElement;
        } else {
            boolean z5 = true;
            int i16 = 0;
            int i17 = 0;
            String str8 = null;
            List list4 = null;
            List list5 = null;
            WsContextualized wsContextualized2 = null;
            List list6 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        i16 |= 1;
                        i14 = i14;
                        str7 = beginStructure.decodeStringElement(descriptor2, 0);
                        i15 = 8;
                        break;
                    case 1:
                        i16 |= 2;
                        i14 = i14;
                        i17 = beginStructure.decodeIntElement(descriptor2, 1);
                        i15 = 8;
                        break;
                    case 2:
                        i13 = i14;
                        str10 = beginStructure.decodeStringElement(descriptor2, 2);
                        i16 |= 4;
                        i14 = i13;
                        i15 = 8;
                        break;
                    case 3:
                        i13 = i14;
                        str9 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str9);
                        i16 |= 8;
                        i14 = i13;
                        i15 = 8;
                        break;
                    case 4:
                        i13 = i14;
                        str11 = beginStructure.decodeStringElement(descriptor2, 4);
                        i16 |= 16;
                        i14 = i13;
                        i15 = 8;
                        break;
                    case 5:
                        i13 = i14;
                        list6 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, access$get$childSerializers$cp[5], list6);
                        i16 |= 32;
                        i14 = i13;
                        i15 = 8;
                        break;
                    case 6:
                        list5 = (List) beginStructure.decodeSerializableElement(descriptor2, 6, access$get$childSerializers$cp[6], list5);
                        i16 |= 64;
                        i15 = 8;
                        i14 = i14;
                        continue;
                    case 7:
                        int i18 = i14;
                        str12 = beginStructure.decodeStringElement(descriptor2, i18);
                        i16 |= 128;
                        i14 = i18;
                        break;
                    case 8:
                        str8 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i15, StringSerializer.INSTANCE, str8);
                        i16 |= 256;
                        i14 = 7;
                        break;
                    case 9:
                        list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 9, access$get$childSerializers$cp[9], list4);
                        i16 |= 512;
                        i14 = 7;
                        break;
                    case 10:
                        wsContextualized2 = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, 10, WsContextualized$$serializer.INSTANCE, wsContextualized2);
                        i16 |= 1024;
                        i14 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i16;
            i12 = i17;
            str = str8;
            list = list4;
            list2 = list5;
            wsContextualized = wsContextualized2;
            list3 = list6;
            str2 = str9;
            str3 = str7;
            str4 = str10;
            str5 = str11;
            str6 = str12;
        }
        beginStructure.endStructure(descriptor2);
        return new WsWorkoutContent(i11, str3, i12, str4, str2, str5, list3, list2, str6, str, list, wsContextualized, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsWorkoutContent value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsWorkoutContent.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
