# ����������� ��������

- [�������](#adapter)
- [�����������](#composite)
- [���������](#decorator)
- [�����](#facade)

#### _C���������� �������� (structural patterns)_ ��������� �������� ����� ������� ��������, ���� �������� ������ � ������� ��������� �������.

`Adapter` - �� ��������� ���������� ������ ������� ����������� ������� ���������;

`Composite` - �������� � �������� � ���������� ��������� ������ �������;

`Decorator` - ����������� ��������� ����� ���������������� ���������� �������, �������� ��� ���������;

`Facade` - ��������� ��������������� ��������� ��� ���������� ������ � ������� ���������;

`*Proxy` - ������� ������, ������� ������������� ������ � ������� �������;

`*Bridge` - ��������� ���������� �� ����������, �������� �� �������� ����������;

`*Flyweight` - ���������� �������� � �������� ����������� ������ ��������.

-------------

> ������� (Adapter) <a name="adapter"></a>

����� � ����� ����������� ������� �� ������� �������� ������������ ��� ������������ ���. ��������, ��������� ������ ����� �������� ������ �����������������, �� ����� ��� ���� ������������� ����������. � ����� ������� ������� ������������ ������� Adapter (�������).

������� Adapter, �������������� ����� ����������� ������� ��� ������������� ��������, ����������� �� ���������� � ����, ���������� ��� ������������ �������������.

- �� ��������� ���������� ������ ������� ����������� ������� ���������;

- ���� ����� ����� ������������ (�������, ����� �� �������� � ������-�����).

###### _����������_:

- ������ �������������� ����������� ����� ��������� ��������� � ������, ���� ���������� ������ � (���) ������������ ��������� �� ����� ��������������� ������������ � ������������ �������.

-------------

> ����������� (Composite) <a name="composite"></a>

`Composite(����������) ` � **�������, ��������������� �������**, ��������� ������, ������� ����� �������� � ���� ������ �������.

������������� ������� ������������� ������ � �������� � ��������� ��������� ����������� ���������.

[������� WikiPedia](https://ru.wikipedia.org/wiki/�����������_(������_��������������))

**����������� ����**:

- ���������� ���������� ������ ������ �������� � ��������� ���;

- ������� ����� ���� ��� ������������ (�������������), ��� � ���������� (��������). ��������� ������ ����� �������� � ���� ��������� ������ ��������, ������� ������� ����������� ���������. ������: ���������� �������� ������� ������� �� ���������, ������ �� ������� ����� ����� ���� �����������;

- ��� ������� �������� � ������������ � ���������� ��������� ������������.


###### _����������_:

- Very costly to create more composite impl;

- �������� ����������� ������ �� ���������� � ��������� ������ Composite �������� ������������ �����. ���, ��������, � ������ ������� ����� �� ����� ������� ������ �����.

-------------

## ��������� (Decorator) <a name="decorator"></a>

- Wrapper

- Add functionality or behavior

- Single Responsibility Principle

- Dynamically compose behavior

- Inheritance and Composition

## _����������_:

- New Class for every feature

- no of objects (more)

- more comples for the clients

-------------

## ����� (Facade) <a name="facade"></a>

- Make API easy 

- Interface not required

- usually a refactoring pattern

## _����������_:

- Over usage

- Clean up design pattern

----------

> *�� ����� �� ���� GitHub [github.com/steklopod](http://www.github.com/steklopod):

## �������� �������� ��������:

**Creational ��������**  � ��� ��� ���� ������� �������� � ����������� �������� ��������.

`Singleton` - ������������ ������������� � ������� ����� ������ ���������� ���������� ������;

`Factory` Method - ���������� ������� �������� �������� �������-�����������;

`Prototype` - ��������� ������� �� ��������� ���������� �������� �������;

`Builder` - �������� ������� �������� ������������ ������� �� ��� �������������;

`Abstract Factory` - ��������� �������� ��� �������� ����� �������� ��������������� ��������.

`����������� ��������`

---------

## ������������� �������� ��������������

������������� ������� (behavioral) -  ���������� ����������� ������� �������������� ��������� �������� � �������.

`Strategy` - ��������� ����� ���������������� ���������� � ������ �����������;

`Iterator` - ������������ ������ � ���������� �������� ��� ��������� ����������� ���������� ���� ���������;

`Observer` - ������� ������ ��� ������������ ��������� � ���������� � ����������� ������ ���������;

`Memento` - ��������� ���������� ��������� ������� ��� ������������ ������������� ��� ��������� ������������;

`Command` - ��������� ������, �������������� ����� ��������� ��������, ������� ����� ��������� � ����������� ������;

`Interpreter` - ���������� ������ ���������� ��������� ���������� �����;

`Mediator` - ������� ������, ������� ���������� �������������� ����� ������� ���������;

`State` - ��������� ������� ������ ���� ��������� ��� ��������� ��� ����������� ���������;

`Template method` - ��������� ��������, �������� ���������� ��������� ������ ��������� �� ���������;

`Visitor` - �������� �������� �� ���������, � �������� �������� ��������;

`Chain of responsibility` - ���������� ��������� ������ ����� ����� ������������ �������, �� ��� ��� ���� ������ �� ����� ���������.

����������� �������: [www.github.com/steklopod/structural-design-pattern](http://www.github.com/steklopod/structural-design-pattern)

 `d.a.kaltovich@gmail.com`