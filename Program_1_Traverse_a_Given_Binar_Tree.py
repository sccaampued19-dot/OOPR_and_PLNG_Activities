class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


def preorder(root):
    if root is None:
        return []
    return [root.value] + preorder(root.left) + preorder(root.right)


def inorder(root):
    if root is None:
        return []
    return inorder(root.left) + [root.value] + inorder(root.right)


def postorder(root):
    if root is None:
        return []
    return postorder(root.left) + postorder(root.right) + [root.value]


root = Node(10)


root.left = Node(5)
root.right = Node(15)


root.left.left = Node(2)
root.left.right = Node(7)


root.right.left = Node(12)
root.right.right = Node(20)


if __name__ == "__main__":
    print(f"Preorder: {preorder(root)}")
    print(f"Inorderl: {inorder(root)}")
    print(f"Postorder: {postorder(root)}")