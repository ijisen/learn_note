// import React from "react";
declare namespace React {
  interface CSSProperties {

  }
  type FC<P = {}> = {}

  type ReactNode = 'ReactNode'

  class Component<P, S> {}
}

interface CardGridProps {
  prefixCls?: string;
  style?: React.CSSProperties;
  className?: string;
  hover?: boolean;
}

declare const Grid: React.FC<CardGridProps>;

interface CardMetaProps {
  prefixCls?: string;
  style?: React.CSSProperties;
  className?: string;
  avatar?: React.ReactNode;
  title?: React.ReactNode;
  description?: React.ReactNode;
}
declare const Meta: React.FC<CardMetaProps>;


export interface AffixProps {
  /**
   * 距离窗口顶部达到指定偏移量后触发
   */
  offsetTop?: number;
  /** 距离窗口底部达到指定偏移量后触发 */
  offsetBottom?: number;
  style?: React.CSSProperties;
  /** 固定状态改变时触发的回调函数 */
  onChange?: (affixed?: boolean) => void;
  /** 设置 Affix 需要监听其滚动事件的元素，值为一个返回对应 DOM 元素的函数 */
  target?: () => Window | HTMLElement | null;
  prefixCls?: string;
  className?: string;
  children: React.ReactNode;
}
declare enum AffixStatus {
  None = 0,
  Prepare = 1
}
interface AffixState {
  affixStyle?: React.CSSProperties;
  placeholderStyle?: React.CSSProperties;
  status: AffixStatus;
  lastAffix: boolean;
  prevTarget: Window | HTMLElement | null;
}
declare type CardType = 'inner';
declare type CardSize = 'default' | 'small';
interface CardTabListType {
  key: string;
  tab: React.ReactNode;
  disabled?: boolean;
}
interface CardProps extends React.Component<AffixProps, AffixState> {
  title?: React.ReactNode;
  actions?: React.ReactNode[];
  style?: React.CSSProperties;
  tabList?: CardTabListType[];
  tabBarExtraContent?: React.ReactNode | null;
  loading?: boolean;
  id?: number;
  activeTabKey?: string;
  size?: CardSize;
  type?: CardType;
  onTabChange?: (key: string) => void;
  go(n: number): void;
  goBack(): void;
  getConfirmation(message: string, callback: (result: boolean) => void): void;
}
interface CardInterface extends React.FC<CardProps> {
  Grid: typeof Grid;
  Meta: typeof Meta;
}
declare const Card: CardInterface;
export default {
  Card,
  AffixStatus,
  Meta,
};
