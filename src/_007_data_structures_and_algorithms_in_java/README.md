# Data Structures and Algorithms in Java

## Overview of Data Structures

Another way to look at data structures is to focus on their strengths and weaknesses.
In this section we’ll provide an overview, in the form of a table, of the major data
storage structures we’ll be discussing in this book. This is a bird’s-eye view of a land-
scape that we’ll be covering later at ground level, so don’t be alarmed if the terms
used are not familiar. Table 1.1 shows the advantages and disadvantages of the
various data structures described in this book.

| Data Structure | Advantages                                                                                    | Disadvantages                                                          |
|----------------|-----------------------------------------------------------------------------------------------|------------------------------------------------------------------------|
| Array          | Quick insertion, very fast access if index known.                                             | Slow search, slow deletion,fixed size.                                 |
| Ordered array  | Quicker search than unsorted array.                                                           | Slow insertion and deletion, fixed size.                               |
| Stack          | Provides last-in, first-out access.                                                           | Slow access to other items.                                            |
| Queue          | Provides first-in, first-out access.                                                          | Slow access to other items.                                            |
| Linked list    | Quick insertion, quick deletion                                                               | Slow search.                                                           |
| Binary tree    | Quick search, insertion,deletion (if tree remains balanced)                                   | Deletion algorithm                       is complex.                   |
| Red-black tree | Quick search, insertion, deletion. Tree always balanced.                                      | Complex                                                                |
| 2-3-4 tree     | Quick search, insertion, deletion. Tree always balanced. Similar trees good for disk storage. | Complex.                                                               |
| Hash table     | Very fast access if key known. Fast insertion.                                                | Slow deletion, access slow if key not known, inefficient memory usage. |
| Heap           | Fast insertion, deletion, access to largest item.                                             | Slow access to other items                                             |
| Graph          | Models real-world situations                                                                  | Some algorithms are slow and complex                                   |

## Overview of Algorithms

Many of the algorithms we’ll discuss apply directly to specific data structures. For
most data structures, you need to know how to:

- **Insert** a new data item.
- **Search** for a specified item.
- **Delete** a specified item.

Also:
- how to **iterate** through all the items in a data structure,
  visiting each one in turn so as to display it or perform some other action on it.
- Another important algorithm category is **sorting**. There are many ways to sort data.
- The concept of **recursion** is important in designing certain algorithms. Recursion
    involves a method calling itself.

## Some concepts

### Database
We’ll use the term database to refer to all the data that will be dealt with in a particu-
lar situation. We’ll assume that each item in a database has a similar format. As an
example, if you create an address book using index cards, these cards constitute a
database. The term file is sometimes used in this sense.

### Record
Records are the units into which a database is divided. They provide a format for
storing information. In the index card analogy, each card represents a record. A
record includes all the information about some entity, in a situation in which there
are many such entities. A record might correspond to a person in a personnel file, a
car part in an auto supply inventory, or a recipe in a cookbook file.

### Field
A record is usually divided into several fields. A field holds a particular kind of data.
On an index card for an address book, a person’s name, address, or telephone
number is an individual field.

### Key
To search for a record within a database, you need to designate one of the record’s
fields as a key (or search key). You’ll search for the record with a specific key. For
instance, in an address book program, you might search in the name field of each
record for the key “Brown.” When you find the record with this key, you can access
all its fields, not just the key. We might say that the key unlocks the entire record.
You could search through the same file using the phone number field or the address
field as the key