/** @jsx svg */

import { svg } from 'snabbdom-jsx';
import {IView, RenderingContext} from "sprotty/lib";
import {TURNNode} from "../../models";
import { VNode } from "snabbdom/vnode";

export class OrNodeView implements IView {

    static readonly TYPE_JOIN = 'turnnode:orJoin';
    static readonly TYPE_FORK = 'turnnode:orFork';


    render(node: TURNNode, context: RenderingContext): VNode {
        return <g class-ucm-edge={true}>
            // Intentionally made as an empty svg group
        </g>;
    }
}